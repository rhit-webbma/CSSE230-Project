import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class locationSearcher extends mapGUI {

	private JTextField distanceOutput;
	private JTextField timeOutput;
	private JTextField textInput;
	private JTextField textOutput;
	private JButton actionButton;
	private JLabel inputRestaurantTitle;
	private JLabel restaurantName = new JLabel();
	private JLabel outputRestaurantTitle;
	private JTextArea inputDescription;
	private JTextArea outputDescription;
	private String inputDescriptionText;
	private String inputRestaurantTitleText;
	private String outputDescriptionText;
	private String outputRestaurantTitleText;
	private int circleIndex;
	private boolean inputTownSelected;
	private mapGUI referenceMap;
	
	private RestaurantList newList = new RestaurantList();
	private GraphStuff graphStuff = new GraphStuff();
	private Graph<Integer> newGraph;
	private boolean descriptionAdded = false;
	
	private String inputNodeText;
	private String outputNodeText;
	
	private boolean paintLines = false;
	private boolean restaurantNamesDrawn = false;
	

	
	
	public locationSearcher(restaurantInfo info, mapGUI refMap)
	{
		//Pull
		setLayout(null);
		
		referenceMap = refMap;
		
		newGraph = graphStuff.getSavedGraph();
		
		super.setBackground(new Color(216, 222, 240));
		
		distanceOutput =  new JTextField("Distance: ");
		distanceOutput.setSize(new Dimension(200, 20));
		distanceOutput.setLocation(new Point(1023, 120));
		distanceOutput.setFont(new Font("SansSerif", Font.PLAIN, 18));
		super.add(distanceOutput);
		
		actionButton = new JButton("Search");
		actionButton.setSize(new Dimension(100, 20));
		actionButton.setLocation(new Point(1075, 90));
		super.add(actionButton);
		
		textInput = new JTextField(10);
		textInput.setSize(new Dimension(200, 25));
		textInput.setLocation(new Point(1025, 25));
		textInput.setUI(new JTextFieldHintUI("Starting Restaurant...", Color.black));
		super.add(textInput);
		
		timeOutput = new JTextField("Time:  ");
		timeOutput.setSize(new Dimension(200, 20));
		timeOutput.setLocation(new Point(1025, 150));
		timeOutput.setFont(new Font("SansSerif", Font.PLAIN, 18));
		super.add(timeOutput);
		
		textOutput = new JTextField(10);
		textOutput.setSize(new Dimension(200, 25));
		textOutput.setLocation(new Point(1025, 60));
		textOutput.setUI(new JTextFieldHintUI("Ending Restaurant...", Color.black));
		super.add(textOutput);

		
		ActionListener mouseEvents = new ActionListener()
			{
			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					
					int circleIndex = referenceMap.getCircleIndex();
					boolean inputTownSelected = referenceMap.getInputTownSelected();
					int circleHoverIndex = referenceMap.getCircleHoverIndex();
					
					listResturantName(circleHoverIndex);

					
					if(circleIndex != 99)
					{
						if(inputTownSelected == true)
						{
							String inputTownName = newGraph.nodes.get(circleIndex + 1).getName();
							
							textInput.setText(inputTownName);
							
						}
						else
						{
							String outputTownName = newGraph.nodes.get(circleIndex + 1).getName();
							
							textOutput.setText(outputTownName);
						}
					}
					
				}
			
			};
			
		Timer clickInput = new Timer(32, mouseEvents);
		
		clickInput.start();
		
		ActionListener buttonListen = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				String input = textInput.getText();
				String output = textOutput.getText();
				
				inputNodeText = input;
				outputNodeText = output;
				
				int inputIndex = newGraph.getIndex(input);
				int outputIndex = newGraph.getIndex(output);
				
				double minimumDist = newGraph.getMinDist(newGraph.nodes.get(inputIndex), newGraph.nodes.get(outputIndex));
				int minimumTime = newGraph.getMinTime(newGraph.nodes.get(inputIndex), newGraph.nodes.get(outputIndex));


				paintLines = true;
			
				inputRestaurantTitleText = newGraph.nodes.get(inputIndex).getName();
				inputDescriptionText = newList.getDescription(inputRestaurantTitleText);
				
				outputRestaurantTitleText = newGraph.nodes.get(outputIndex).getName();
				outputDescriptionText = newList.getDescription(outputRestaurantTitleText);
				
				DecimalFormat df = new DecimalFormat("##.##");
				
				distanceOutput.setText("Distance: " + df.format(minimumDist) + " miles");
				timeOutput.setText("Time: " + df.format(minimumTime) + " minutes");
				
				changeDescription();
				
				repaint();
				
			}
			
		};
		
		actionButton.addActionListener(buttonListen);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		if(paintLines == true)
		{
		newGraph = graphStuff.getSavedGraph();
		
		int inputIndex = newGraph.getIndex(inputNodeText);
		int outputIndex = newGraph.getIndex(outputNodeText);

		ArrayList<Graph<Integer>.Edge> short_edge = newGraph.DistArray(newGraph.nodes.get(inputIndex), newGraph.nodes.get(outputIndex));
		for(int k = 0; k < short_edge.size(); k++) {
			g.drawLine((short_edge.get(k).getFirstNode().getX() + 5), short_edge.get(k).getFirstNode().getY() + 5, (short_edge.get(k).getOtherNode().getX() + 5), short_edge.get(k).getOtherNode().getY() + 5);
		}

		}
		else return;
	}
	
	public void changeDescription()
	{
		
		if(this.descriptionAdded == false)
		{
		
		inputRestaurantTitle =  new JLabel(inputRestaurantTitleText);
		inputRestaurantTitle.setSize(new Dimension(100, 175));
		inputRestaurantTitle.setLocation(new Point(1090, 100));
		inputRestaurantTitle.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		Font titleFont = inputRestaurantTitle.getFont();
		Map attributes = titleFont.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		inputRestaurantTitle.setFont(titleFont.deriveFont(attributes));
		
		super.add(inputRestaurantTitle);
		
		inputDescription =  new JTextArea(inputDescriptionText);
		
		inputDescription.setLineWrap(true);
		inputDescription.setWrapStyleWord(true);
		inputDescription.setSize(new Dimension(255, 200));
		inputDescription.setLocation(new Point(1005, 200));
		inputDescription.setFont(new Font("SansSerif", Font.PLAIN, 14));
		super.add(inputDescription);
		
		outputRestaurantTitle =  new JLabel(outputRestaurantTitleText);
		outputRestaurantTitle.setSize(new Dimension(100, 100));
		outputRestaurantTitle.setLocation(new Point(1090, 360));
		outputRestaurantTitle.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		outputRestaurantTitle.setFont(titleFont.deriveFont(attributes));
		
		super.add(outputRestaurantTitle);
		
		outputDescription =  new JTextArea(outputDescriptionText);
		
		outputDescription.setLineWrap(true);
		outputDescription.setWrapStyleWord(true);
		outputDescription.setSize(new Dimension(255, 200));
		outputDescription.setLocation(new Point(1005, 430));
		outputDescription.setFont(new Font("SansSerif", Font.PLAIN, 14));
		super.add(outputDescription);
		
		this.descriptionAdded = true;
		
		}
		else
		{
			inputRestaurantTitle.setText(inputRestaurantTitleText);
			inputDescription.setText(inputDescriptionText);
			outputRestaurantTitle.setText(outputRestaurantTitleText);
			outputDescription.setText(outputDescriptionText);
		}
	}
	
	public void listResturantName(int circleHoverIndex)
	{
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int mouseX = (int) b.getX();
		int mouseY = (int) b.getY();
		
		if(circleHoverIndex != 99)
		
		{
		
		String name = newGraph.nodes.get(circleHoverIndex +1).getName();
		restaurantName.setText(name);
		restaurantName.setSize(new Dimension(100, 100));
		restaurantName.setLocation(new Point(mouseX - 100, mouseY - 100));
		
		
		if(restaurantNamesDrawn == false)
		{
			super.add(restaurantName);
			restaurantNamesDrawn = true;
		}
		else
		{
			restaurantName.setText(name);
		}
		}
		else
		{
			restaurantName.setText("");
			restaurantName.setSize(new Dimension(100, 100));
			restaurantName.setLocation(new Point(mouseX - 100, mouseY - 100));
		}
		
	}
	
	
}

