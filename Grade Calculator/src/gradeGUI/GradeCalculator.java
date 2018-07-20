package gradeGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GradeCalculator extends Application {

	private PrimaryPane primaryPane;

	public static void main(String[] args) {

		launch(args);
		
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryPane = new PrimaryPane();
		Scene scene = new Scene(primaryPane, 700, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
