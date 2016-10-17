package controllers;

import models.GameObject;
import views.GameView;

import java.awt.*;

/**
 * Created by apple on 10/11/16.
 */
public class EnemyPlaneController extends SingleController {

    private static final int SPEED = 5;

    public EnemyPlaneController(GameObject gameObject, GameView gameView) {
        super(gameObject, gameView);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
    }

    @Override
    public void run() {
        gameObject.move(0, SPEED);
    }
}
