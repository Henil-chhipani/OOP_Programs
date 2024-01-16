package class_obj;

public class Car {
    // make, model, and year. Display the car details
    String maker, model;
    int year;

    Car(String maker, String model, int year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    void printCar() {
        System.out.println("maker :" + maker);
        System.out.println("model :" + model);
        System.out.println("year :" + year);
    }
}
