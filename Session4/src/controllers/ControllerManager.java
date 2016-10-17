package controllers;

import java.awt.*;

import java.util.Vector;

/**
 * Created by apple on 10/11/16.
 */
public class ControllerManager implements BaseController {

    protected Vector<SingleController> singleControllers;

    public ControllerManager() {
        this.singleControllers = new Vector<>();
    }

    public void add(SingleController singleController) {
        this.singleControllers.add(singleController);
    }

    @Override
    public void run() {
        for(SingleController singleController : singleControllers) {
            singleController.run();
        }
    }

    @Override
    public void draw(Graphics g) {
        for(SingleController singleController : singleControllers) {
            singleController.draw(g);
        }
    }
}
