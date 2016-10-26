package controllers.managers;

import controllers.EventType;
import controllers.SingleController;
import controllers.Subcriber;

import java.util.Vector;

/**
 * Created by Nhan on 10/25/2016.
 */
public class NotificationCenter {
    private Vector<Subcriber> subcriberVector;

    public NotificationCenter() {
        subcriberVector = new Vector<>();
    }

    public void onEvent(EventType eventType, SingleController sender) {
        for (Subcriber subcriber : subcriberVector) {
            subcriber.onEvent(eventType, sender);
        }
    }

    public void register(Subcriber subcriber) {
        subcriberVector.add(subcriber);
    }

    public void unregister(Subcriber subcriber) {
        subcriberVector.remove(subcriber);
    }

    public final static NotificationCenter instance = new NotificationCenter();
}
