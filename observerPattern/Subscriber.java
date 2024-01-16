package observerPattern;

public class Subscriber {
    private String name;
    private Channal channal = new Channal();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + name + " video uloded");
    }

    public void subscriberChannl(Channal ch) {
        channal = ch;
    }
}
