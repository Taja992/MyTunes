package dk.MyTunes.GUI.FXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GraphicalGUI extends Application {
    public static void run() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScene.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("My Tunes");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        // Set minimum size
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(200);
        // Set maximum size
        primaryStage.setMaxWidth(800);
        primaryStage.setMaxHeight(600);
        primaryStage.show();
    }
}