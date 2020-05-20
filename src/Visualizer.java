import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visualizer extends JPanel {
	
	@Override
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		
		Image mapImage = null;
		BufferedImage newImage = null;
		
		try {
			mapImage = ImageIO.read(new File("src/Map.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Color newColor = new Color(96, 96, 96);
		

		g.setColor(newColor);
		g.drawImage(mapImage, 0, 0, this);
		g.fillRect(1500, 0, 420, 1080);
	}
	
	public static void main(String[] args)
	{
		Visualizer visual = new Visualizer();
		
		JFrame frame = new JFrame();
		frame.setSize(1920, 1080);
		
		frame.add(visual);
		
		visual.repaint();
		
		frame.setVisible(true);
	}
	
	
	
}

