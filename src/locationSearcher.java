import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class locationSearcher extends JPanel{

	private JLabel distanceOutput;
	private JLabel timeOutput;
	private JTextField textInput;
	private JTextField textOutput;
	private JButton actionButton;
	
	public locationSearcher(restaurantInfo info)
	{
		setLayout(null);
		
		
		super.setBackground(new Color(216, 222, 240));
		
		distanceOutput =  new JLabel("Distance: ");
		distanceOutput.setSize(new Dimension(100, 100));
		distanceOutput.setLocation(new Point(50, 60));
		distanceOutput.setFont(new Font("SansSerif", Font.PLAIN, 18));
		super.add(distanceOutput);
		
		actionButton = new JButton("Search");
		actionButton.setSize(new Dimension(100, 20));
		actionButton.setLocation(new Point(75, 90));
		super.add(actionButton);
		
		textInput = new JTextField(10);
		textInput.setSize(new Dimension(200, 25));
		textInput.setLocation(new Point(25, 25));
		textInput.setUI(new JTextFieldHintUI("Starting City...", Color.black));
		super.add(textInput);
		
		timeOutput = new JLabel("Time:  ");
		timeOutput.setSize(new Dimension(100, 100));
		timeOutput.setLocation(new Point(50, 100));
		timeOutput.setFont(new Font("SansSerif", Font.PLAIN, 18));
		super.add(timeOutput);
		
		textOutput = new JTextField(10);
		textOutput.setSize(new Dimension(200, 25));
		textOutput.setLocation(new Point(25, 60));
		textOutput.setUI(new JTextFieldHintUI("Ending City...", Color.black));
		super.add(textOutput);
		
		
		ActionListener buttonListen = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String input = textInput.getText();
				String output = textInput.getText();
				
				
			}
			
		};
		
		actionButton.addActionListener(buttonListen);
	}
	
	
}
