import java.util.ArrayList;
import java.util.Hashtable;


public class Graph<T> {
	public Hashtable<T, Node> nodes;

	public Graph(){
		nodes = new Hashtable<T, Node>();
	}
	
	public int getIndex(String restaurantName)
	{
		int index = 0;
		
		for(int i = 1; i < nodes.size(); i++)
		{
			Node nodeValue = nodes.get(i);
			
			if(nodeValue.name.contentEquals(restaurantName))
			{
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public class Node {
		private T element;
		private ArrayList<Edge> neighbors;
		private String name;
		private int x;
		private int y;
		
		public Node(T e, String restaurant, int x_pos, int y_pos){
			element = e;
			neighbors = new ArrayList<Edge>();
			name = restaurant;
			x = x_pos;
			y = y_pos;
			
		}
		
		public void addEdge(T e, int time, double distance) {
			Node otherNode = nodes.get(e);
			neighbors.add(new Edge(this, otherNode, time, distance));
		}
		
		public double shortestDist(Node o, int edges, double total) {
			if(edges > 12) {
				return 10000000;
			}
			double current = 100000;
			double num = 0;
			for(int i = 0; i < neighbors.size(); i++) {
				
				if(neighbors.get(i).node2.element.equals(o.element)) {
					return total + neighbors.get(i).distance;
				}
				else {
					num = neighbors.get(i).node2.shortestDist(o, edges + 1, total + neighbors.get(i).distance);
					if(num < current) {
						current = num;
					}
				}
			}
			return current;
		}
		
		public double shortestDistArray(Node o, int edges, double total, ArrayList<Edge> dist_edges) {
			if(edges > 12) {
				return 10000000;
			}
			double current = 100000;
			double num = 0;
			int shortest = 0;
			for(int i = 0; i < neighbors.size(); i++) {
				
				if(neighbors.get(i).node2.element.equals(o.element)) {
					if(edges == 0) {
						dist_edges.add(neighbors.get(i));
					}
					return total + neighbors.get(i).distance;
				}
				else {
					num = neighbors.get(i).node2.shortestDistArray(o, edges + 1, total + neighbors.get(i).distance, dist_edges);
					if(num < current) {
						current = num;
						shortest = i;
					}
				}
			}
			if(edges == 0) {
				dist_edges.add(neighbors.get(shortest));
				if(!neighbors.get(shortest).node2.element.equals(o.element)) {
					neighbors.get(shortest).node2.shortestDistArray(o, 0, total, dist_edges);
				}
			}
			
			return current;
		}
		
		public int shortestTime(Node o, int edges, int total) {
			if(edges > 12) {
				return 10000000;
			}
			int current = 100000;
			int num = 0;
			for(int i = 0; i < neighbors.size(); i++) {
				
				if(neighbors.get(i).node2.element.equals(o.element)) {
					return total + neighbors.get(i).time;
				}
				else {
					num = neighbors.get(i).node2.shortestTime(o, edges + 1, total + neighbors.get(i).time);
					if(num < current) {
						current = num;
						
					}
				}
			}
			return current;
		}

		public int shortestTimeArray(Node o, int edges, int total, ArrayList<Edge> time_edges) {
			if(edges > 12) {
				return 10000000;
			}
			int current = 100000;
			int num = 0;
			int shortest = 0;
			for(int i = 0; i < neighbors.size(); i++) {
				
				if(neighbors.get(i).node2.element.equals(o.element)) {
					if(edges == 0) {
						time_edges.add(neighbors.get(i));
					}
					return total + neighbors.get(i).time;
				}
				else {
					num = neighbors.get(i).node2.shortestTimeArray(o, edges + 1, total + neighbors.get(i).time, time_edges);
					if(num < current) {
						current = num;
						shortest = i;
					}
				}
			}
			if(edges == 0) {
				time_edges.add(neighbors.get(shortest));
				if(!neighbors.get(shortest).node2.element.equals(o.element)) {
					neighbors.get(shortest).node2.shortestTimeArray(o, 0, total, time_edges);
				}
			}
			
			return current;
			
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
		public ArrayList<Edge> getNeighbors(){
			return neighbors;
		}
		
	}
	
	public class Edge {
		private Node node1;
		private Node node2;
		private int time;
		private double distance;
		
		public Edge(Node n1, Node n2, int t, double d){
			node1 = n1;
			node2 = n2;
			time = t;
			distance = d;
		}
		
		public Node getFirstNode() {
			return node1;
		}
		
		public Node getOtherNode() {
			return node2;
		}
	}

	public boolean addNode(T e, String rest, int x, int y) {
		nodes.put(e, new Node(e, rest, x, y));
		return true;
	}
	
	public boolean addEdge(T e1, T e2, int time, double distance) {
		if (!nodes.containsKey(e1) && !nodes.containsKey(e2)) return false;
		nodes.get(e1).addEdge(e2, time, distance);
		nodes.get(e2).addEdge(e1, time, distance);
	    return true;
	}

	public double getMinDist(Node n1, Node n2) {
//		ArrayList<Edge> edges = new ArrayList<Edge>();
//		n1.shortestDistArray(n2, 0, 0, edges);
//		double dist = 0;
//		for(int i = 0; i < edges.size(); i++) {
//			dist += edges.get(1).distance;
//		}
//		return dist;
		return n1.shortestDist(n2, 0, 0);
	}
	
	public int getMinTime(Node n1, Node n2) {
		return n1.shortestTime(n2, 0, 0);
	}
	
	public ArrayList<Edge> DistArray(Node n1, Node n2) {
		ArrayList<Edge> edges = new ArrayList<Edge>();
		n1.shortestDistArray(n2, 0, 0, edges);
		return edges;
	}
	
	public ArrayList<Edge> TimeArray(Node n1, Node n2) {
		ArrayList<Edge> edges = new ArrayList<Edge>();
		n1.shortestTimeArray(n2, 0, 0, edges);
		return edges;
	}

}