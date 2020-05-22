
public class GraphStuff {
	
	Graph<Integer> savedGraph;
	
	public GraphStuff()
	{
		Graph<Integer> g = new Graph<Integer>();
		g.addNode(1,"Fifi's Lunch Box", 490, 230);
		g.addNode(2,"Rick's Smokehouse", 500, 300);
		g.addNode(3,"Chavas", 420, 300);
		g.addNode(4,"Azzip Pizza", 210, 580);
		g.addNode(5,"Insomnia Cookies", 340, 300);
		g.addNode(6,"Original Spaghetti and Sub House", 475, 280);
		g.addNode(7,"7th and Elm", 345, 260);
		g.addNode(8,"Rose Gardens", 580, 245);
		g.addNode(9,"Five Guys", 170, 630);
		g.addNode(10,"Bandanas BBQ", 350, 500);
		g.addNode(11,"Bev's Restaurant", 470, 420);
		g.addNode(12,"Bush Family Restaurant", 360, 240);
		g.addNode(13,"Cackleberries", 355, 370);
		g.addNode(14,"Cheddars", 230, 595);
		g.addNode(15,"Cranky's", 380, 180);
		g.addNode(16,"Fly IN Cafe", 600, 400);
		g.addNode(17,"Gingersnaps", 280, 520);
		g.addNode(18,"Golden Corral", 330, 560);
		g.addNode(19,"Grand Traverse Pie Co.", 325, 280);
		g.addNode(20,"Homey's Que Grill", 440, 400);
		g.addNode(21,"IHOP", 330, 480);
		g.addNode(22,"Umi Grill and Sushi Bar", 410, 445);
		g.addNode(23,"Kleptz's Restaurant", 640, 225);
		g.addNode(24,"Logan's Rib-Eye", 540, 265);
		g.addNode(25,"LongHorn Steakhouse", 380, 525);
		g.addNode(26,"Magdy's Restaurant", 350, 440);
		g.addNode(27,"Meadows Cafe", 485, 350);
		g.addNode(28,"McCalister's Deli", 355, 590);
		g.addNode(29,"Outback Steakhouse", 385, 570);
		g.addNode(30,"Oy Vey Bakery & Deli", 330, 200);
		g.addNode(31,"Park Avenue Diner", 440, 50);
		g.addNode(32,"Monical's Pizza", 560, 460);
		g.addNode(33,"Stables Steakhouse", 415, 360);
		g.addNode(34,"Mcdonalds", 610, 505);
		g.addNode(35,"Sunrise Family Restaurant", 375, 490);
		g.addNode(36,"TGI Friday's", 310, 530);
		g.addNode(37,"Wings Etc", 190, 670);
		g.addNode(38,"J Gumbo's", 350, 320);
		g.addNode(39,"East Star Chinese Buffet", 320, 505);
		g.addNode(40,"Taj Mahal", 355, 410);
		
		
		
		g.addEdge(1, 27, 4, 0.56);
		g.addEdge(1, 2, 1, 0.1);
		g.addEdge(1, 6, 1, 0.28);
		g.addEdge(2, 27, 4, 0.59);
		g.addEdge(2, 24, 2, 0.66);
		g.addEdge(3, 38, 2, 0.14);
		g.addEdge(3, 5, 2, 0.09);
		g.addEdge(3, 13, 2, 0.25);
		g.addEdge(3, 33, 2, 0.34);
		g.addEdge(4, 14, 1, 0.09);
		g.addEdge(4, 37, 3, 0.29);
		g.addEdge(4, 28, 5, 0.49);
		g.addEdge(5, 19, 2, 0.25);
		g.addEdge(5, 7, 2, 0.62);
		g.addEdge(6, 27, 4, 0.51);
		g.addEdge(6, 20, 5, 1.43);
		g.addEdge(6, 33, 5, 1.38);
		g.addEdge(6, 12, 5, 1.36);
		g.addEdge(6, 15, 6, 1.73);
		g.addEdge(7, 12, 1, 0.25);
		g.addEdge(7, 30, 3, 0.84);
		g.addEdge(8, 23, 8, 3.13);
		g.addEdge(8, 31, 13, 4.18);
		g.addEdge(8, 24, 5, 2.00);
		g.addEdge(8, 32, 6, 2.94);
		g.addEdge(8, 16, 7, 2.01);
		g.addEdge(9, 37, 5, 0.69);
		g.addEdge(9, 34, 11, 4.42);
		g.addEdge(10, 34, 7, 4.22);
		g.addEdge(10, 39, 4, 0.13);
		g.addEdge(10, 35, 2, 0.16);
		g.addEdge(10, 25, 3, 0.21);
		g.addEdge(11, 27, 3, 0.75);
		g.addEdge(11, 20, 3, 0.98);
		g.addEdge(11, 22, 6, 1.94);
		g.addEdge(11, 32, 7, 2.43);
		g.addEdge(12, 30, 4, 0.89);
		g.addEdge(12, 15, 4, 0.99);
		g.addEdge(13, 33, 1, 0.23);
		g.addEdge(13, 40, 4, 0.75);
		g.addEdge(14, 28, 3, 0.47);
		g.addEdge(15, 30, 3, 0.91);
		g.addEdge(16, 23, 8, 3.06);
		g.addEdge(16, 32, 6, 2.15);
		g.addEdge(17, 36, 2, 0.24);
		g.addEdge(17, 39, 2, 0.42);
		g.addEdge(18, 36, 4, 0.30);
		g.addEdge(18, 29, 3, 0.16);
		g.addEdge(19, 30, 6, 1.38);
		g.addEdge(19, 40, 4, 0.99);
		g.addEdge(20, 40, 5, 0.92);
		g.addEdge(20, 33, 2, 0.60);
		g.addEdge(21, 39, 3, 0.24);
		g.addEdge(21, 35, 3, 0.17);
		g.addEdge(21, 26, 2, 0.62);
		g.addEdge(22, 26, 1, 0.04);
		g.addEdge(24, 32, 7, 2.00);
		g.addEdge(25, 36, 3, 0.28);
		g.addEdge(25, 39, 1, 0.19);
		g.addEdge(27, 33, 5, 1.45);
		g.addEdge(28, 29, 1, 0.08);
		g.addEdge(31, 15, 7, 2.75);
		g.addEdge(32, 34, 3, 0.45);
		g.addEdge(38, 5, 2, 0.09);
		
		System.out.println(g.getMinDist(g.nodes.get(13), g.nodes.get(32)));
		System.out.println(g.getMinTime(g.nodes.get(13), g.nodes.get(32)));
		System.out.println(g.DistArray(g.nodes.get(13), g.nodes.get(32)));
		System.out.println(g.TimeArray(g.nodes.get(13), g.nodes.get(32)));
		
		savedGraph = g;
	}
	
	public Graph getSavedGraph() {
		return savedGraph;
	}
	

}