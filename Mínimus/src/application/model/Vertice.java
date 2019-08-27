package application.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Vertice extends Circle{
	
	private Float shortDist;
	private List<Aresta> next;
	private Aresta back;
	private Boolean isRoot;

	public Vertice(double d, double e, double i) {
		super(d, e, i);
		shortDist = Float.POSITIVE_INFINITY;
		isRoot = Boolean.FALSE;
		
		this.setFill(Color.GREEN);
		this.setStroke(Color.BLACK);
		
		next = new ArrayList<Aresta>();
	}
	
	public void setBack(Aresta a) {
		a.getLine().setStroke(Color.RED);
		
		if(back != null) {
			back.getLine().setStroke(Color.BLACK);
			back = a;
			
		}else {
			back = a;
		}
	}
	
	public List<Aresta> getNext() {
		return next;
	}


	public Float getShortDist() {
		return shortDist;
	}


	public void setShortDist(Float shortDist) {
		this.shortDist = shortDist;
	}
	
	public void setIsRoot(Boolean isRoot) {
		if(isRoot) {
			this.setFill(Color.RED);
		}else {
			this.setFill(Color.GREEN);
		}
		this.isRoot = isRoot;
	}
}
