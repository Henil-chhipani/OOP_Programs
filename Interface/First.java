package Interface;

import java.nio.charset.CoderResult;

class Ractangle implements Drawable {

    public void draw() {
        System.out.println("this is Ractangle");
    }
}

class Circle implements Drawable {

    public void draw() {
        System.out.println("this is Circle");
    }
}

public class First {
    public static void main(String[] args) {
        Ractangle r = new Ractangle();
        r.draw();
        Circle c = new Circle();
        c.draw();
    }
}
