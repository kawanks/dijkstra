package dijkstra.models;

public class DijkstraAlgorithm {
	public Graph gf;
	
	public DijkstraAlgorithm(Graph g) throws CloneNotSupportedException {
		
		
		gf = g.clone();	
		
		System.out.println();
		
	}
	
	public void mudar() {
		gf.setGraph(1,1,6f);
	}
	
}
