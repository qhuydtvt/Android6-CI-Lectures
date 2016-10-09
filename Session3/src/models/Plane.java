package models;

/**
 * Created by apple on 10/4/16.
 */
public class Plane {
    public static final int PLANE_WIDTH = 50;
    public static final int PLANE_HEIGHT = 35;
    private int x;
    private int y;

    public Plane(int x, int y) {
        this.x = x;
        this.y = y;

    }

    // Gettters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMiddleX() {
        return x + PLANE_WIDTH / 2;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
