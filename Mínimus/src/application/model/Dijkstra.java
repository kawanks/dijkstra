package application.model;

import java.util.List;

import javafx.scene.paint.Color;

public class Dijkstra {
	private Vertice root;
	private List<Vertice> vertices;
	
	
	public Dijkstra(Graph grafo) {
		if(grafo.getVertices()!= null && grafo.getRoot() != null) {
		root = grafo.getRoot();
		vertices =  grafo.getVertices();
		}
	}
	
	
	public void execute() {
		if(vertices != null) {
		root.setShortDist(0f);
		
		while(!vertices.isEmpty()) {
			Vertice v = vertices.get(0);
			
			for(Vertice vt : vertices) {
				System.out.println(vt.getShortDist());
				if(v.getShortDist() > vt.getShortDist()) v = vt;
			}
			

			
			for(Aresta a : v.getNext()) {
				//System.out.println("asdfghjgfdawSDFGDSA");
				Float p = v.getShortDist() + a.getValue();
				Vertice end = a.getEnd();
				//System.out.println(a);

				if(p < end.getShortDist()) {
					end.setShortDist(p);
					end.setBack(a);
				}
			}
			System.out.println("| "+ v.getShortDist() +" |");

			vertices.remove(v);
		}
		}
	}
}
