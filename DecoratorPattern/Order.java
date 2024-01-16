package DecoratorPattern;

/**
 * Order
 */
public class Order {
    public static void main(String[] args) {

        Capachino c = new Capachino();

        System.out.println("simple capachino cost :" + c.cost());
        Milk m = new Milk(c);
        System.out.println("capachino with exra milk :" + m.cost());
        Sugar s1 = new Sugar(c);
        System.out.println("Capachino with exta sugar :" + s1.cost());
        Sugar s = new Sugar(m);
        System.out.println("Capachino with exta sugar and milk :" + s.cost());

        System.out.println();
        Expreso e = new Expreso();
        System.out.println("simple Expreso cost :" + e.cost());
        Sugar s2 = new Sugar(e);
        System.out.println("Expreso with exta sugar :" + s2.cost());
    }

}