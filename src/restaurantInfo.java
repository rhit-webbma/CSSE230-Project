import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class restaurantInfo extends JPanel {

	private JTextArea Description;
	private JLabel restaurantTitle;
	private String restaurantTitleText;
	private String descriptionText;
	private final static String newline = "\n";

	
	public restaurantInfo()
	{
		setLayout(null);
		
		super.setBackground(new Color(214, 242, 223));
		
		restaurantTitle =  new JLabel(restaurantTitleText);
		restaurantTitle.setSize(new Dimension(100, 100));
		restaurantTitle.setLocation(new Point(90, 0));
		restaurantTitle.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		Font titleFont = restaurantTitle.getFont();
		Map attributes = titleFont.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		restaurantTitle.setFont(titleFont.deriveFont(attributes));
		
		super.add(restaurantTitle);
		
		Description =  new JTextArea(descriptionText);
		
		Description.setLineWrap(true);
		Description.setWrapStyleWord(true);
		Description.setSize(new Dimension(255, 400));
		Description.setLocation(new Point(5, 75));
		Description.setFont(new Font("SansSerif", Font.PLAIN, 14));
		super.add(Description);
		
		
		
	}
	
	public void setRestaurantInfo(String title, String desc)
	{
		restaurantTitleText = title;
		descriptionText = desc;
	}

	
}
