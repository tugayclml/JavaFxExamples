package com.fxScene;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ReadInputFromTextField extends Application{
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Read Input From TextField");
		
		TextField input = new TextField();
		
		Button read = new Button("Read");
		read.setOnAction(e -> isNotNumber(input,input.getText()));
		
		VBox layout = new VBox();
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(input,read);
		
		Scene scene = new Scene(layout,300,300);
		window.setScene(scene);
		window.show();
	}	
	
	public boolean isNotNumber(TextField input,String message) {
		try {
			int age = Integer.parseInt(input.getText());
			System.out.println("User is: " + age);
			return true;
		} catch (Exception e) {
			System.out.println("Error: " + message + " is not a number");
			return false;
		}
	}
}
