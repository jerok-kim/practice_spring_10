package design_patterns.singleton_pattern;

/**
 * 싱글톤 패턴
 */
public class App {
    public static void main(String[] args) {
        DoorMan doorMan = DoorMan.getInstance();
        doorMan.쫓아내(new Cat());
    }
}
