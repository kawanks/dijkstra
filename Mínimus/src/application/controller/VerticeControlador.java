package application.controller;




import application.model.Vertice;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;

public class VerticeControlador implements EventHandler<ContextMenuEvent>{
	private Vertice v;
	
	@Override
	public void handle(ContextMenuEvent event) {
		
		this.v = (Vertice) event.getSource();
		
		ContextMenu menu = new ContextMenu();
		MenuItem item1 = new MenuItem("Set as root");
		
		item1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				setRoot(true);
			}
		});
		
		menu.getItems().add(item1);

		menu.show(v, event.getScreenX(), event.getScreenY());
		
	}
	
	
	public void setRoot(Boolean b) {
		if(b) {
			this.v.setIsRoot(true);
			this.v.setColor(Color.CADETBLUE);
		}else {
			this.v.setIsRoot(false);
		}
	}

}
