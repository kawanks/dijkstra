package application.model;

import java.awt.Point;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Aresta extends Group{
	private Vertice start;
	private Vertice end;
	private Text value;
	private Line line;
	
	public Aresta(){
		this.line = new Line();
		super.getChildren().add(line);
	}
	
	public Aresta(double startX, double startY, double endX, double endY) {
		line = new Line(startX,  startY,  endX,  endY);
		super.getChildren().add(line);
	}

	public Float getValue() {
		return Float.parseFloat(value.getText());
	}
	
	private Point getMiddle(Point start, Point end) {
		Double dX = (end.getX() - start.getX())/2;
		Double dY = (end.getY() - start.getY())/2;
		
		Point middle = new Point();
		middle.setLocation(start.getX() + dX, start.getY() + dY);
		
		return middle;
	}
	
	public void setValue(String value) {
		
		Point start = new Point();
		start.setLocation(this.start.getCenterX(), this.start.getCenterY());
		
		Point end = new Point();
		end.setLocation(this.end.getCenterX(), this.end.getCenterY());
		
		Point middle = getMiddle(start, end);
		
		this.value = new Text(middle.getX(),middle.getY(),value);
		this.value.getStyleClass().add("value");
		super.getChildren().add(this.value);
	}
	
	public void setStart(Vertice v) {
		this.start = v;
	}
	
	public void setEnd(Vertice v) {
		this.end = v;
	}
	
	public Vertice getEnd() {
		return this.end;
	}
	
	public Line getLine() {
		return this.line;
	}
}
