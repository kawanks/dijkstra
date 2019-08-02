package application.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertice> vertices;
	private List<Aresta> arestas;
	private Vertice root;
	
	public Graph() {
		this.vertices = new ArrayList<Vertice>();
		this.arestas = new ArrayList<Aresta>();
	}
	
	public Vertice getRoot() {
		return this.root;
	}
	
	public void setRoot(Vertice root) {
		if(this.root != null) this.root.setIsRoot(false); 
		root.setIsRoot(true);
		this.root = root;
	}
	
	public List<Vertice> getVertices(){
		return this.vertices;
	}
	
	public void addVertice(Vertice v) {
		this.vertices.add(v);
	}
	
	public List<Aresta> getArestas(){
		return this.arestas;
	}
	
	public void addAresta(Aresta a) {
		this.arestas.add(a);
	}
}
