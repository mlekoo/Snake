package sample;

import javafx.scene.Node;

public class Snake extends Node {

    private int length;
    private int posX;
    private int posY;
    private int direction;

    Snake(int posX, int posY, SnakeDirection direction){
        this.length = 3;
        this.posX = posX;
        this.posY = posY;
        this.direction = direction.direction;
    }


    private void setDirection(int direction){
        this.direction = direction;
    }

    private void eat(){
        this.length++;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirection(SnakeDirection direction){
        this.direction = direction.direction;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getDirection() {
        return direction;
    }

    public int getLength() {
        return length;
    }
}
