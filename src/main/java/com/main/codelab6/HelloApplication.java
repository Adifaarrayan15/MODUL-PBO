package com.main.codelab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root pane
        AnchorPane root = new AnchorPane();
        root.setPrefSize(500, 400);

        // Create and configure the labels
        Label loginLabel = new Label("Login Page");
        loginLabel.setFont(new Font("System Bold", 36));
        loginLabel.setLayoutX(159);
        loginLabel.setLayoutY(32);

        Label usernameLabel = new Label("Username");
        usernameLabel.setFont(new Font(18));
        usernameLabel.setLayoutX(87);
        usernameLabel.setLayoutY(106);

        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(new Font(18));
        passwordLabel.setLayoutX(89);
        passwordLabel.setLayoutY(186);

        // Create and configure the text fields
        TextField usernameField = new TextField();
        usernameField.setLayoutX(104);
        usernameField.setLayoutY(133);
        usernameField.setPrefSize(300, 35);

        TextField passwordField = new TextField();
        passwordField.setLayoutX(104);
        passwordField.setLayoutY(213);
        passwordField.setPrefSize(300, 35);

        // Create and configure the error label
        Label errorLabel = new Label();
        errorLabel.setFont(new Font(14));
        errorLabel.setTextFill(Color.RED);
        errorLabel.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        errorLabel.setLayoutX(111);
        errorLabel.setLayoutY(345);
        errorLabel.setPrefSize(300, 17);

        // Create and configure the login button
        Button loginButton = new Button("Login");
        loginButton.setFont(new Font("System Bold", 18));
        loginButton.setLayoutX(175);
        loginButton.setLayoutY(275);
        loginButton.setPrefSize(149, 53);

        loginButton.setOnAction(actionEvent -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if(username.isEmpty()) {
                errorLabel.setText("Username is empty.");
                return;
            }
            if(password.isEmpty()) {
                errorLabel.setText("Password is empty.");
                return;
            }

            if(username.equals("202310370311407") && password.equals("202310370311407")) {
                SuccessApplication successApplication = new SuccessApplication();
                successApplication.start(primaryStage);
            }else {
                if(!username.equals("202310370311407")) {
                    errorLabel.setText("Username wrong.");
                }else {
                    errorLabel.setText("Password wrong.");
                }
            }
        });

        // Add all elements to the root pane
        root.getChildren().addAll(loginLabel, usernameLabel, passwordLabel, usernameField, passwordField, errorLabel, loginButton);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root);
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
