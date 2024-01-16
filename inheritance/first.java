package inheritance;

class Ractangle extends Shape {
    int l, b;

    Ractangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        int area = l * b;
        System.out.println("area is :" + area);
    }

    public void perimeter() {
        int perimeter = 2 * (l + b);
        System.out.println("perimeter is :" + perimeter);
    }
}

class circle extends Shape {
    int r;

    circle(int r) {
        this.r = r;
    }

    public void perimeter() {
        double p = 2 * 3.14 * r;
        System.out.println("perimeter is :" + p);
    }

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("area is :" + a);
    }
}

class tringle extends Shape {
    int a, b, c;

    tringle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void area() {
        double s = (a + b + c) / 2;
        double area = s * (s - a) * (s - b) * (s - c);
        double a = Math.sqrt(area);
        System.out.println("area is :" + a);
    }

    public void perimeter() {
        int p = a + b + c;
        System.out.println("perimeter is :" + p);
    }

}

public class first {
    public static void main(String[] args) {
        Ractangle r = new Ractangle(3, 2);
        r.area();
        r.perimeter();

        circle c = new circle(3);
        c.area();
        c.perimeter();

        tringle t = new tringle(9, 9, 3);
        t.area();
        t.perimeter();
    }

}
