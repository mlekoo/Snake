package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuSceneController {

    private Stage mainStage;

    public void setMainStage(Stage mainStage){
        this.mainStage = mainStage;
    }

    @FXML
    public void StartButtonEvent() throws IOException {

        // Loads GameScene


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameScene.fxml"));
        try {
            Parent game = fxmlLoader.load();
            mainStage.setScene(new Scene(game,1280,720));

            GameSceneController gameSceneController = fxmlLoader.getController();
            gameSceneController.setMainStage(mainStage);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
