package application.controller;

import application.model.Vertice;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controle {
	@FXML
	private Pane pane;
	
	@FXML
	private Group group;
	
	@FXML
	private void vert(MouseEvent e) {
		if(e.getButton().equals(MouseButton.PRIMARY)) {
			
		Vertice vertice = new Vertice(e.getSceneX() - pane.getLayoutX(), e.getSceneY() - pane.getLayoutY(), 50);
			
		
		vertice.setOnContextMenuRequested(new VerticeControlador());
		
		//System.out.println(vertice);
		
		this.group.getChildren().add(vertice);
		
		}
	}
	
	
}
