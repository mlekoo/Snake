package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenuScene.fxml"));
        Parent menu = fxmlLoader.load();
        MainMenuSceneController mainMenuSceneController = fxmlLoader.getController();
        mainMenuSceneController.setMainStage(primaryStage);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(menu, 1280, 720));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
