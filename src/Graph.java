import java.util.ArrayList;
import java.util.Hashtable;

public class Graph<T> {
	private Hashtable<T, Node> nodes;

	public Graph(){
		nodes = new Hashtable<T, Node>();
	}
	
	private class Node {
		private T element;
		private ArrayList<Edge> neighbors;
		private String name;
		
		public Node(T e, String restaurant){
			element = e;
			neighbors = new ArrayList<Edge>();
			name = restaurant;
		}
		
		public void addEdge(T e, int time, int distance) {
			Node otherNode = nodes.get(e);
			neighbors.add(new Edge(otherNode, time, distance));
		}
		
	}
	
	private class Edge {
		private Node otherNode;
		private int time;
		private int distance;
		
		public Edge(Node n, int t, int d){
			otherNode = n;
			time = t;
			distance = d;
		}
	}

	public boolean addNode(T e, String rest) {
		nodes.put(e, new Node(e, rest));
		return true;
	}
	
	public boolean addEdge(T e1, T e2, int time, int distance) {
		if (!nodes.containsKey(e1) && !nodes.containsKey(e2)) return false;
		nodes.get(e1).addEdge(e2, time, distance);
	    return true;
	}


}