package design_patterns.observer_pattern.push.sub;

public class Sub2 implements SubListener {

    @Override
    public void update(String msg) {
        System.out.println("sub2 이 받은 알림 : " + msg);
    }
}
