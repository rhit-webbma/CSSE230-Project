import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class mapGUI extends JPanel {
	
	private GraphStuff gr = new GraphStuff();
	private Graph<Integer> graph;

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
		graph = gr.getSavedGraph();
		
		
		g.drawImage(map, 0, 0, this);
		
		for(int i = 1; i < graph.nodes.size() + 1; i++) {
			Graph<Integer>.Node current = graph.nodes.get(i);
			g.fillOval(current.getX(), current.getY(), 10, 10);
//			for(int j = 0; j < current.getNeighbors().size(); j++) {
//				g.drawLine(current.getX() + 5, current.getY() + 5, current.getNeighbors().get(j).getOtherNode().getX() + 5, current.getNeighbors().get(j).getOtherNode().getY() + 5);
//			}
		}
		
		
//		g.fillOval(330, 200, 10, 10); //Oy Vey
//		g.fillOval(380, 180, 10, 10); //Crankys
//		g.fillOval(440, 50, 10, 10);  //Park Ave
//		g.fillOval(360, 240, 10, 10); //Bush
//		g.fillOval(345, 260, 10, 10); //7th
//		g.fillOval(340, 300, 10, 10); //Insomnia
//		g.fillOval(420, 300, 10, 10); //Chavas
//		g.fillOval(350, 320, 10, 10); //J Gum
//		g.fillOval(325, 280, 10, 10); //Pie co
//		g.fillOval(355, 370, 10, 10); //Cackle
//		g.fillOval(415, 360, 10, 10); //Stables
//		g.fillOval(490, 230, 10, 10); //Fifi
//		g.fillOval(475, 280, 10, 10); //Spag
//		g.fillOval(500, 300, 10, 10); //Ricks
//		g.fillOval(540, 265, 10, 10); //Logans
//		g.fillOval(580, 245, 10, 10); //Rose
//		g.fillOval(640, 225, 10, 10); //Kleptz
//		g.fillOval(600, 400, 10, 10); //Fly IN
//		g.fillOval(485, 350, 10, 10); //Meadows
//		g.fillOval(470, 420, 10, 10); //Bevs
//		g.fillOval(560, 460, 10, 10); //Monicals
//		g.fillOval(610, 505, 10, 10); //Maccas
//		g.fillOval(440, 400, 10, 10); //Homeys
//		g.fillOval(355, 410, 10, 10); //Taj
//		g.fillOval(350, 440, 10, 10); //Magdys
//		g.fillOval(410, 445, 10, 10); //Umi
//		g.fillOval(330, 480, 10, 10); //IHOP
//		g.fillOval(375, 490, 10, 10); //Sunrise
//		g.fillOval(320, 505, 10, 10); //East Star
//		g.fillOval(350, 500, 10, 10); //Bandana
//		g.fillOval(280, 520, 10, 10); //Ginger
//		g.fillOval(380, 525, 10, 10); //Longhorn
//		g.fillOval(310, 530, 10, 10); //TGI
//		g.fillOval(330, 560, 10, 10); //Golden
//		g.fillOval(385, 570, 10, 10); //Outback
//		g.fillOval(355, 590, 10, 10); //Mccally
//		g.fillOval(230, 595, 10, 10); //Cheddars
//		g.fillOval(190, 670, 10, 10); //Wings
//		g.fillOval(170, 630, 10, 10); //Five Guys
//		g.fillOval(210, 580, 10, 10); //Azzip
		
		
	}
	
	public mapGUI()
	{
		super.repaint();
	}
	
}
