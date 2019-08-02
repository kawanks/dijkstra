package application.controller;

import application.model.Dijkstra;
import application.model.Graph;
import application.model.Vertice;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controle {
	private Boolean vertice;
	private Boolean aresta;
	private Graph grafo;
	private ArestaControlador ac;
	
	public Controle() {
		this.vertice = Boolean.valueOf(false);
		this.aresta = Boolean.valueOf(false);
		this.grafo = new Graph();
		this.ac = new ArestaControlador(grafo);
	}
	
	/*Componentes do FXML*/
	@FXML
	private Pane pane;
	@FXML
	private Group group;
	@FXML
	private Button btnVert;
	@FXML
	private Button btnAre;
	
	@FXML
	private void vert(MouseEvent e) {
		if(this.vertice && e.getButton().equals(MouseButton.PRIMARY)) {
			
		Vertice vertice = new Vertice(e.getSceneX() - pane.getLayoutX(), e.getSceneY() - pane.getLayoutY(), 50);
		
		vertice.setOnContextMenuRequested(new VerticeControlador(grafo));
		vertice.setOnMouseClicked(ac);
		
		
		this.group.getChildren().add(vertice);
		grafo.addVertice(vertice);
		}
	}
	
	@FXML
	private void setDijkstra(MouseEvent e) {
		Dijkstra dj = new Dijkstra(grafo);
		dj.execute();
	}

	@FXML
	private void btnVert(MouseEvent e) {
		if(!this.vertice) {
			this.aresta = disableBtn(btnAre);
			ac.setCond(false);
			this.vertice = enableBtn(btnVert);
		}else {
			this.vertice = disableBtn(btnVert);
		}
	}
	
	//Não consegui passar Boolean por parâmetro.
	private Boolean enableBtn(Button btn) {
		btn.setStyle("-fx-background-color: #2d3f4a");
		return true;
	}
	 
	private Boolean disableBtn(Button btn) {
		btn.setStyle(null);
		return false;
	}
	
	@FXML
	private void btnAre(MouseEvent e) {
		if(!this.aresta) {
			this.vertice = disableBtn(btnVert);
			this.aresta = enableBtn(btnAre);
			ac.setCond(true);
			
		}else {
			this.aresta= disableBtn(btnAre);
			ac.setCond(false);
		}
	}
}
