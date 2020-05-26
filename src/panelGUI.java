import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGUI extends JPanel{

	private locationSearcher lCS;
	private restaurantInfo info;
	
	
	public panelGUI(mapGUI refMap)
	{
		setLayout(null);
		
		info = new restaurantInfo();
		lCS = new locationSearcher(info, refMap);
	
		lCS.setSize(new Dimension(1280, 720));
		lCS.setLocation(new Point(0,0));
		super.add(lCS);
		
		info.setSize(new Dimension(280, 504));
		info.setLocation(new Point(0, 216));
		super.add(info);
		

		
		super.setSize(new Dimension(280, 720));
		super.setBackground(new Color(216,240,234));
	}
	
}
