package application.model;


import java.util.List;


public class Dijkstra {
	private Vertice root;
	private List<Vertice> vertices;
	
	
	public Dijkstra(Graph grafo) {
		if(grafo.getVertices()!= null && grafo.getRoot() != null) {
		root = grafo.getRoot();
		vertices =  grafo.getVertices();
		}
	}
	
	private class ThBtn implements Runnable{

		@Override
		public void run() {
			
			
			
		}

	
		
		
		
	}
	
	public void execute() {
		if(vertices != null) {
		root.setShortDist(0f);
		
		while(!vertices.isEmpty()) {
			Vertice v = vertices.get(0);
			
			for(Vertice vt : vertices) {
				if(v.getShortDist() > vt.getShortDist()) v = vt;
			}
			
			for(Aresta a : v.getNext()) {
				Float p = v.getShortDist() + a.getValue();
				Vertice end = a.getEnd();

				if(p < end.getShortDist()) {
					end.setShortDist(p);
					end.setBack(a);
				}
			}

			vertices.remove(v);
			
		
			/*while(true) {
				ThBtn th = new ThBtn();
				Thread t1 = new Thread(th);
				t1.start();
			}*/
		}
		}
	}
}
