package design_patterns.strategy_pattern;

/**
 * 전략 패턴
 */
public class App {

    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan doorMan = new DoorMan();
        doorMan.쫓아내(new Cat());
        doorMan.쫓아내(new Mouse());
    }

}
