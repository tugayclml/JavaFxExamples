package com.fxScene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxStartPage extends Application{
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("First Java Fx Window");
		
		button = new Button();
		button.setText("Click Me!");
		button.setOnAction(e -> System.out.println("Lambda expression"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	
}
