package design_patterns.decorator_pattern.notification;

public class EmailNotifier implements Notifier {
    Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public EmailNotifier() {
    }

    @Override
    public void send() {
        if (notifier != null) {
            notifier.send();
        }

        System.out.println("이메일 알림");
    }
}
