package design_patterns.singleton_pattern;

public class DoorMan {

    public static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance() {
        return doorMan;
    }

    private DoorMan() {
    }

    public void 쫓아내(Animal a) {
        System.out.println(a.getName() + " 쫓아내");
    }

}
