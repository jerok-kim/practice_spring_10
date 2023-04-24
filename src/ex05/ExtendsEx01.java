package ex05;

class Engine {
    int power = 2000;
}

class Car {
    Engine e;

    public Car(Engine e) {
        this.e = e;
    }
}

public class ExtendsEx01 {

    public static void main(String[] args) {
        Car car = new Car(new Engine());
        System.out.println(car.e.power);
    }
    
}
