package design_patterns.observer_pattern.polling.pub;

import design_patterns.observer_pattern.polling.sub.SubListener;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PubListener {
    private List<SubListener> subListeners = new ArrayList<>();

    @Override
    public void add(SubListener subListener) {
        subListeners.add(subListener);
    }

    @Override
    public void remove(SubListener subListener) {
        subListeners.remove(subListener);
    }

    @Override
    public void notifyChange(String msg) {
        try {
            for (int i = 1; i < 6; i++) {
                Thread.sleep(1000);
                System.out.println(".");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        for (SubListener subListener : subListeners) {
            subListener.update(msg);
        }
    }
}
