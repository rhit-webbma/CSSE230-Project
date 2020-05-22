import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class locationSearcher extends JPanel{

	private JTextField distanceOutput;
	private JTextField timeOutput;
	private JTextField textInput;
	private JTextField textOutput;
	private JButton actionButton;
	private GraphStuff graphStuff;
	private Graph<Integer> newGraph;
	
	
	
	public locationSearcher(restaurantInfo info)
	{
		//Pull
		setLayout(null);
		
		graphStuff = new GraphStuff();
		
		newGraph = graphStuff.getSavedGraph();
		
		super.setBackground(new Color(216, 222, 240));
		
		distanceOutput =  new JTextField("Distance: ");
		distanceOutput.setSize(new Dimension(200, 20));
		distanceOutput.setLocation(new Point(23, 120));
		distanceOutput.setFont(new Font("SansSerif", Font.PLAIN, 18));
		super.add(distanceOutput);
		
		actionButton = new JButton("Search");
		actionButton.setSize(new Dimension(100, 20));
		actionButton.setLocation(new Point(75, 90));
		super.add(actionButton);
		
		textInput = new JTextField(10);
		textInput.setSize(new Dimension(200, 25));
		textInput.setLocation(new Point(25, 25));
		textInput.setUI(new JTextFieldHintUI("Starting Restaurant...", Color.black));
		super.add(textInput);
		
		timeOutput = new JTextField("Time:  ");
		timeOutput.setSize(new Dimension(200, 20));
		timeOutput.setLocation(new Point(25, 150));
		timeOutput.setFont(new Font("SansSerif", Font.PLAIN, 18));
		super.add(timeOutput);
		
		textOutput = new JTextField(10);
		textOutput.setSize(new Dimension(200, 25));
		textOutput.setLocation(new Point(25, 60));
		textOutput.setUI(new JTextFieldHintUI("Ending Restaurant...", Color.black));
		super.add(textOutput);
		
		
		ActionListener buttonListen = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String input = textInput.getText();
				String output = textOutput.getText();
				
				int inputIndex = newGraph.getIndex(input);
				int outputIndex = newGraph.getIndex(output);
				
				double minimumDist = newGraph.getMinDist(newGraph.nodes.get(inputIndex), newGraph.nodes.get(outputIndex));
				int minimumTime = newGraph.getMinTime(newGraph.nodes.get(inputIndex), newGraph.nodes.get(outputIndex));
				
				ArrayList<Graph<Integer>.Edge> short_edge = newGraph.DistArray(newGraph.nodes.get(inputIndex), newGraph.nodes.get(outputIndex));
				for(int k = 0; k < short_edge.size(); k++) {
					g.drawLine(short_edge.get(k).getFirstNode().getX() + 5, short_edge.get(k).getFirstNode().getY() + 5, short_edge.get(k).getOtherNode().getX() + 5, short_edge.get(k).getOtherNode().getY() + 5);
				}

				
				distanceOutput.setText("Distance: " + minimumDist + " miles");
				timeOutput.setText("Time: " + minimumTime + " minutes");
				
				
			}
			
		};
		
		actionButton.addActionListener(buttonListen);
	}
	
	
}
