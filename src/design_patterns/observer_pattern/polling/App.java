package design_patterns.observer_pattern.polling;

import design_patterns.observer_pattern.polling.pub.Publisher;
import design_patterns.observer_pattern.polling.sub.Sub1;
import design_patterns.observer_pattern.polling.sub.Sub2;

/**
 * 옵저버 패턴 (콜백)
 */
public class App {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        publisher.add(sub1);
        publisher.add(sub2);

        new Thread(() -> {
            publisher.notifyChange("상품 들어왔어요");
        }).start();
    }
}
