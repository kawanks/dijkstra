package dijkstra.models;

public class Graph implements Cloneable{
	
	//Override the clone() method to allow clone the graph instance.
	@Override
	public Graph clone() throws CloneNotSupportedException {
		return (Graph) super.clone();
	}
	
	  private Float graph[][];
	  
	  public Float[][] getGraph() {
		return graph;
	}
	  public void setGraph(Integer x, Integer y, Float f) {
		this.graph[x-1][y-1] = f;
	}
	  
	  public Graph(Integer v) {
		graph = new Float[v][v];
	}
	
	
	  
	public void linkNode(Integer origin, Integer destiny, Float weight){
		graph[origin-1][destiny-1] = weight;
	}
	
	public void showNodes() {
		for (Float[] floats : graph) {
			for(Float content : floats) {
				System.out.println(content);
			}
		
		}
	}
}
