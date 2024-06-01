package com.main.codelab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SuccessApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setPrefSize(500, 400);

        // Create and configure the label
        Label helloLabel = new Label("Hello Adifa");
        helloLabel.setFont(new Font(23));
        helloLabel.setLayoutX(190);
        helloLabel.setLayoutY(166);

        // Add the label to the root pane
        root.getChildren().add(helloLabel);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello Adifa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
