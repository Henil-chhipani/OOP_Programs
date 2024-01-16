package method_overloading;

public class Calc {
    public void add(int n1, int n2) {
        int t = n1 + n2;
        System.out.println("simple total is two num " + t);
    }

    public void add(int n1, int n2, int n3) {
        int t = n1 + n2 + n3;
        System.out.println("overied total is three num " + t);
    }
}
