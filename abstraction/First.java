package abstraction;

class Dog extends Animal {

    public void eat() {
        System.out.println("dog eats");
    }

    public void sound() {
        System.out.println("dog sound");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("cat eats");
    }

    public void sound() {
        System.out.println("cat sound");
    }
}

public class First {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sound();

        Cat c = new Cat();
        c.eat();
        c.sound();
    }

}
