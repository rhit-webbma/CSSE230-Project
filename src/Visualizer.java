import java.awt.Dimension;
import javax.swing.JFrame;

public class Visualizer extends JFrame {
	
	public Visualizer()
	{
		super.setLayout(null);
		super.setSize(new Dimension(1280, 750));
		
		mapGUI map = new mapGUI();
		map.setLocation(0, 0);
		map.setSize(new Dimension(1000, 720));
		
		panelGUI panel = new panelGUI(map);
		panel.setLocation(0, 0);
		panel.setSize(new Dimension(1280, 720));
		
		super.add(map);
		super.add(panel);
		
		super.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Visualizer();
	}
	
	
	
}

