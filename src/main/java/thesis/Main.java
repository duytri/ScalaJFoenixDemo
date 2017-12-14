package main.java.thesis;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			AnchorPane root = new AnchorPane();
			primaryStage.setTitle("CHUONG TRINH TIM KIEM VAN BAN TUONG DONG THEO CHU DE");
			
			loader.setLocation(Main.class.getResource("view/MainForm.fxml"));
			root = loader.load();

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setMaximized(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
