import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Visualizer extends JFrame {
	
	public Visualizer()
	{
		super.setLayout(null);
		super.setSize(new Dimension(1280, 750));
		
		mapGUI map = new mapGUI();
		map.setLocation(0, 0);
		map.setSize(new Dimension(1000, 720));
		
		panelGUI panel = new panelGUI();
		panel.setLocation(1000, 0);
		panel.setSize(new Dimension(280, 720));
		
		
		super.add(panel);
		super.add(map);
		
		super.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Visualizer();
	}
	
	
	
}

