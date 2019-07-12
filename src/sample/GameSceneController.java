package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static sample.SnakeDirection.FORWARD;

public class GameSceneController {

    ImageView[][] grid = new ImageView[33][19];

    //Gamescene 33x19

    Snake snake = new Snake(16,9,FORWARD);

    private Stage mainStage;
    @FXML
    private GridPane gridPane;

    SnakePart snakePart = new SnakePart();

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    @FXML
    public void initialize(){
        for(int i = 0; i < 33; i++){
            for(int j = 0; j < 19; j++){
                grid[i][j] = new ImageView();
            }
        }
        for(int i = 0; i < 33; i++){
            for(int j = 0; j < 19; j++){
                gridPane.add(grid[i][j],i,j);
            }
        }
        gridPane.add(new ImageView(),4,4);
       // gridPane.add(snakePart.getSnakePart(),snake.getPosX(),snake.getPosY());
       // gridPane.getChildren().remove(3,3);

    }

    public void snakeMove(){
        if(snake.getDirection() == 1){
            snakePart = new SnakePart();

            snake.setPosY(snake.getPosY()+1);

          //  gridPane.add(snakePart.getSnakePart(),4,4);
        }

    }

    public void gameMechanic() throws InterruptedException {
        while(true){
            System.out.println("SHIT");
           // gridPane.getChildren().remove();
         //   gridPane.add(new ImageView(),4,4);
           // snakeMove();


            Thread.sleep(1000);
        }
    }

}

