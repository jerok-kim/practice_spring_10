package ex05;

/**
 * 오직 추상화에 목적이 있다
 */
abstract class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ExtendsEx03 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
    }

}
