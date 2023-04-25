package design_patterns.decorator_pattern.notification;

// 래퍼가 없는 Decorator
public class BasicNotifier implements Notifier{
    
    // 이 객체는 무언가를 의존하면 안된다.
    
    @Override
    public void send() {
        System.out.println("기본 알림");
    }
}
