package com.fxScene;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class AlertBoxes extends Application{

	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("AlertBox Example");
		
		window.setOnCloseRequest(e -> closeProgram());
		
		button = new Button("Click Me!");
		//button.setOnAction(e -> AlertBox.display("Warning", "This window is dangerous")7
		
		/*button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Warning","Are you sure want to do this?");
			System.out.println("Result : "+result);
		});*/
		
		button.setOnAction(e -> {
			e.consume();
			closeProgram();
		});
		
				
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,400,400);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram() {
		Boolean answer = ConfirmBox.display("Warning", "Are you sure want to exit?");
		if(answer)
			window.close();
			
	}
	
	
}
