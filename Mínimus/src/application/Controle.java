package application;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controle {
	private Boolean color = false;
	
	@FXML
	private Group group;
	
	@FXML
	private void vert(MouseEvent e) {
		Circle circle = new Circle(e.getScreenX(), e.getScreenY(), 50);
		
		if(this.color)
			circle.setFill(Color.BLUE);
		else
			circle.setFill(Color.RED);
		
		this.group = new Group(circle);
		
	}
	
	
	
}
