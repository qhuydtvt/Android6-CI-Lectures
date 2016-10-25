package controllers;

import models.GameObject;
import utils.Utils;
import views.GameView;

/**
 * Created by apple on 10/9/16.
 */
public class BulletController extends SingleController implements Contactable {

    public static final int SPEED = 10;

    public BulletController(GameObject gameObject, GameView gameView) {
        super(gameObject, gameView);
        CollisionPool.instance.register(this);
    }

    @Override
    public void run() {
        gameObject.move(0, -SPEED);
    }

    @Override
    public void onCollide(Contactable contactable) {
        if(contactable instanceof EnemyPlaneController) {
            ((EnemyPlaneController) contactable).destroy();
            ExplosionController explosionController = ExplosionController.create(gameObject.getX(), gameObject.getY());
            ControllerManager.explosionManager.add(explosionController);
            Utils.playSound("resources/explosion.wav", false);
        }
    }
}
