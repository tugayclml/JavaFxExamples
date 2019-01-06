package com.fxScene;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;


public class ListViewExample extends Application{

	Stage window;
	Scene scene;
	ListView<String> listView;
	
	public static void main(String[] args) throws Exception{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("ListView Example");
		
		listView = new ListView<>();
		listView.getItems().addAll("Iron Man","Titanic","Contact","Surrogates");
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().add(listView);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	
}
