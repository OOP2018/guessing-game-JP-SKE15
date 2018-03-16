import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	Counter counter = new Counter();
	@Override
	public void start(Stage stage) {
		try {
			
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("GuessingGameUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Converter");
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
