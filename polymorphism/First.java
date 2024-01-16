package polymorphism;

class Ractangle implements Shape {
    int l, b;

    Ractangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void calculateArea() {
        int area = l * b;
        System.out.println("area is :" + area);
    }
}

class circle implements Shape {
    int r;

    circle(int r) {
        this.r = r;
    }

    public void calculateArea() {
        double a = 3.14 * r * r;
        System.out.println("area is :" + a);
    }
}

public class First {
    public static void main(String[] args) {
        Ractangle r = new Ractangle(3, 2);
        r.calculateArea();

        circle c = new circle(3);
        c.calculateArea();

    }
}
