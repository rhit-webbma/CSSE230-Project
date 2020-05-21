import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelGUI extends JPanel{

	private locationSearcher lCS = new locationSearcher();
	
	
	public panelGUI()
	{
		setLayout(null);
		
		lCS.setSize(new Dimension(280, 216));
		lCS.setLocation(new Point(0,0));
		super.add(lCS);
		
		

		
		super.setSize(new Dimension(280, 720));
		super.setBackground(new Color(216,240,234));
	}
	
}
