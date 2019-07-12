package sample;

import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.security.Key;


import static sample.SnakeDirection.*;

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

    public static final boolean areYouDead = true;

    private boolean die = false;



    @FXML
    public void initialize(){


        for(int i = 0; i < 33; i++){
            for(int j = 0; j < 19; j++){
                grid[i][j] = new ImageView();
                gridPane.add(grid[i][j],i,j);
            }
        }

        Task gameMechanic = new Task(){
            protected Boolean call() throws Exception{
                while(die != areYouDead){
                    snakeMove();
                    System.out.println("gameTask");
                    Thread.sleep(1000);
                }
                return die;
            }
        };
        Thread thread = new Thread(gameMechanic);
        thread.start();
        gridPane.addEventHandler(KeyEvent.KEY_PRESSED,(event) -> {
            if(event.getCode() != KeyCode.RIGHT){
                System.out.println("sz");
            }
        });
    }

    public void snakeMove(){
        if(snake.getDirection() == 1){
            snakePart = new SnakePart();
            grid[snake.getPosX()][snake.getPosY()].setImage(snakePart.getSnakeHead());
            snake.setPosY(snake.getPosY()-1);

            //  gridPane.add(snakePart.getSnakePart(),4,4);
        }

    }

   // public void gameMechanic() throws InterruptedException {
    //    while(true){
        //    System.out.println("SHIT");

        //    grid[6][7].setImage(null);

           // Thread.sleep(1000);
    //    }
 //   }

}

