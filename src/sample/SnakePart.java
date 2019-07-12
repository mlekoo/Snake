package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SnakePart {
    Image snakeHead;
    Image snakePart;

    SnakePart(){
        try {
            BufferedImage image = ImageIO.read(new File("head2.png"));
            snakeHead = SwingFXUtils.toFXImage(image,null);
            image = ImageIO.read(new File("bodyPart.png"));
            snakePart = SwingFXUtils.toFXImage(image,null);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public Image getSnakePart() {
        return snakePart;
    }

    public Image getSnakeHead() {
        return snakeHead;
    }
}
