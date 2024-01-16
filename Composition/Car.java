package Composition;

public class Car {
    Car() {
        System.out.println("car class ");
    }

    Engine e = new Engine("Maruti");

    public static void main(String[] args) {
        Car c = new Car();
    }
}
