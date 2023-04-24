package ex06;

class Hamburger {
    String name = "햄버거";
}

class Potato {
    String name = "감자";
}

class Coke {
    String name = "콜라";
}

class HamburgerSet {
    Hamburger hamburger;
    Potato potato;
    Coke coke;

    public HamburgerSet(Hamburger hamburger, Potato potato, Coke coke) {
        this.hamburger = hamburger;
        this.potato = potato;
        this.coke = coke;
    }
}

public class CompositeEx01 {

    public static void main(String[] args) {
        HamburgerSet set = new HamburgerSet(new Hamburger(), new Potato(), new Coke());
        System.out.println(set.hamburger.name);
        System.out.println(set.potato.name);
        System.out.println(set.coke.name);
    }

}
