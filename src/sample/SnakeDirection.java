package sample;
public enum SnakeDirection {

    FORWARD(1),
    BACKWARD(2),
    LEFT(3),
    RIGHT(4);

    int direction;

    private SnakeDirection(int direction) {
        this.direction = direction;
    }
}