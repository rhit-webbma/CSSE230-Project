import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class mapGUI extends JPanel {

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		BufferedImage map = null;
		BufferedImage menu = null;
		
		try {
			map = ImageIO.read(new File("src/Map.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.drawImage(map, 0, 0, this);
		
	}
	
	public mapGUI()
	{
		super.repaint();
	}
	
}
