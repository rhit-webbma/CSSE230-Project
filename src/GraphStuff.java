
public class GraphStuff {
	
	public static void main(String[] args){
		
		Graph<Integer> g = new Graph<Integer>();
		g.addNode(1,"Fifi's Lunch Box");
		g.addNode(2,"Rick's Smokehouse");
		g.addNode(3,"Chavas");
		g.addNode(4,"Azzip Pizza");
		g.addNode(5,"Insomnia Cookies");
		g.addNode(6,"Original Spaghetti and Sub House");
		g.addNode(7,"7th and Elm");
		g.addNode(8,"Rose Gardens");
		g.addNode(9,"Five Guys");
		g.addNode(10,"Bandanas BBQ");
		g.addNode(11,"Bev's Restaurant");
		g.addNode(12,"Bush Family Restaurant");
		g.addNode(13,"Cackleberries");
		g.addNode(14,"Cheddars");
		g.addNode(15,"Cranky's");
		g.addNode(16,"Fly IN Cafe");
		g.addNode(17,"Gingersnaps");
		g.addNode(18,"Golden Corral");
		g.addNode(19,"Grand Traverse Pie Co.");
		g.addNode(20,"Homey's Que Grill");
		g.addNode(21,"IHOP");
		g.addNode(22,"Umi Grill and Sushi Bar");
		g.addNode(23,"Kleptz's Restaurant");
		g.addNode(24,"Logan's Rib-Eye");
		g.addNode(25,"LongHorn Steakhouse");
		g.addNode(26,"Magdy's Restaurant");
		g.addNode(27,"Meadows Cafe");
		g.addNode(28,"McCalister's Deli");
		g.addNode(29,"Outback Steakhouse");
		g.addNode(30,"Oy Vey Bakery & Deli");
		g.addNode(31,"Park Avenue Diner");
		g.addNode(32,"Monical's Pizza");
		g.addNode(33,"Stables Steakhouse");
		g.addNode(34,"Mcdonalds");
		g.addNode(35,"Sunrise Family Restaurant");
		g.addNode(36,"TGI Friday's");
		g.addNode(37,"Wings Etc");
		g.addNode(38,"J Gumbo's");
		g.addNode(39,"East Star Chinese Buffet");
		g.addNode(40,"Taj Mahal");
		
		
		
		g.addEdge(1, 27, 4, 0.56);
		g.addEdge(1, 2, 1, 0.1);
		g.addEdge(1, 6, 1, 0.28);
		g.addEdge(2, 27, 4, 0.59);
		g.addEdge(2, 24, 2, 0.66);
		g.addEdge(3, 38, 1, 0.01);
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
	}

}