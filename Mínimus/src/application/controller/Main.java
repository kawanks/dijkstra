package application.controller;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	private Controle control;
	
	public Main() {
		this.control = new Controle();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("../view/TelaInicial.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("style/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Mínimus");
			//primaryStage.setMaximized(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
