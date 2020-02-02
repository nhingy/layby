package com.derekcode;

import com.derekcode.model.ObjName;
import com.derekcode.util.Utils;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Layby extends Application {

	private Utils util;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage){
		init(stage);
		stage.show();
	}

	public void init(Stage stage) {
		util = new Utils();
		util.loadObjects();
		Group root = new Group();
		ImageView player = new ImageView(util.getImage(ObjName.PLAYER));
		player.setX(200);
		player.setY(200);
		player.setFitWidth(100);
		player.setPreserveRatio(true);
		player.setSmooth(false);
		root.getChildren().add(player);
		Scene scene = new Scene(root, 1000, 1000);

		stage.setTitle("Here we go");
		stage.setScene(scene);
	}

}

