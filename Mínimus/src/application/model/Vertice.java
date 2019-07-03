package application.model;

import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Vertice extends Circle{
	
	private Float shortDist;
	private List<Vertice> nexts;
	private Boolean isRoot;
	private Color color;

	public Vertice(double d, double e, double i) {
		super(d, e, i);
		this.shortDist = Float.POSITIVE_INFINITY;
		this.isRoot = Boolean.FALSE;
		this.color = Color.GREEN;
		
		this.setFill(this.color);
		this.setStroke(Color.BLACK);
	}

	public Float getShortDist() {
		return shortDist;
	}


	public void setShortDist(Float shortDist) {
		this.shortDist = shortDist;
	}
	
	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}
	
	public void setColor(Color color) {
		this.color = color;
		this.setFill(this.color);
	}
}
