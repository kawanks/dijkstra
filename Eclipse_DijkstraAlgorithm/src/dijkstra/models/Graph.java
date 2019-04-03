package dijkstra.models;

public class Graph implements Cloneable{
	
	//Override the clone() method to allow clone the graph instance.
	@Override
	public Graph clone() throws CloneNotSupportedException {
		Graph ref = new Graph(graph.length);
		
		for (int i=0; i< graph.length; i++) {
			for(int j=0; j<graph.length; j++) {
				ref.graph[i][j] = graph[i][j];
			}
		
		}
		
		return (Graph) ref;
	}
	
	//Matriz t
	  private Float graph[][];
	  
	//Getter
	  public Float[][] getGraph() {
		return graph;
	}
	 //Setter que recebe X e Y da matriz e o valor da aresta
	  public void setGraph(Integer x, Integer y, Float f) {
		this.graph[x-1][y-1] = f;
	}
	  
	  //Instancia grafo
	  public Graph(Integer v) {
		graph = new Float[v][v];
	}
	
	
	//Liga dois vértices, recebe origem e destino e o peso da aresta
	public void linkNode(Integer origin, Integer destiny, Float weight){
		graph[origin-1][destiny-1] = weight;
	}
	
	
	//Mostra a matriz
	public void showNodes() {
		for (Float[] floats : graph) {
			for(Float content : floats) {
				System.out.println(content);
			}
		
		}
	}
	
	
}
