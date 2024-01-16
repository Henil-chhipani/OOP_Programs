package Abstract_Factory;

class ConcreteFactory1 extends AbstractFactory {

    public void productA() {
        System.out.println("this caocrete 1 product a");

    }

    public void productB() {
        System.out.println("this caocrete 1 product b");

    }
}

class ConcreteFactory2 extends AbstractFactory {

    public void productA() {
        System.out.println("this caocrete 2 product a");

    }

    public void productB() {
        System.out.println("this caocrete 2 product b");

    }
}

public class First {
    public static void main(String[] args) {
        ConcreteFactory1 c1 = new ConcreteFactory1();
        c1.productA();
        c1.productB();
        ConcreteFactory2 c2 = new ConcreteFactory2();
        c2.productA();
        c2.productB();

    }
}
