package design_patterns.observer_pattern.polling.pub;

import design_patterns.observer_pattern.polling.sub.SubListener;

public interface PubListener {
    void add(SubListener subListener);

    void remove(SubListener subListener);

    void notifyChange(String msg);
}
