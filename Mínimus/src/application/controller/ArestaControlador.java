package application.controller;

import javax.swing.JOptionPane;

import application.model.Aresta;
import application.model.Graph;
import application.model.Vertice;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class ArestaControlador implements EventHandler<MouseEvent>{
	private Boolean begin;
	private Aresta aresta;
	private Boolean cond;
	private Graph grafo;
	
	public ArestaControlador(Graph g) {
		grafo = g;
		begin = true;
		cond = false;
	}
	
	public void setCond(Boolean b) {
		this.cond = b;
	}
	
	
	@Override
	public void handle(MouseEvent event) {
		if(cond && event.getButton().equals(MouseButton.PRIMARY)) {
		 Vertice v = (Vertice) event.getSource();
		 Group g = (Group) v.getParent();
		 
		 
		 if(begin) {
		 Aresta a = new Aresta();
		 
		 v.getNext().add(a);
		 a.setStart(v);
		 a.getLine().setStartX(v.getCenterX());
		 a.getLine().setStartY(v.getCenterY());
		 this.begin = false;
		 this.aresta = a;
		 
		 }else{
			 this.aresta.setEnd(v);
			 this.aresta.setValue(JOptionPane.showInputDialog("Digite o valor da aresta:"));
			 this.aresta.getLine().setEndX(v.getCenterX());
			 this.aresta.getLine().setEndY(v.getCenterY());
			 this.begin = true;
			 this.grafo.addAresta(this.aresta);
			 g.getChildren().add(this.aresta);
			 //System.out.println(this.grafo.getArestas().size() + "  " + this.grafo.getVertices().size());
			
		 }
		}
		
	}
	
	

}
