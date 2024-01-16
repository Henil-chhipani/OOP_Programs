package observerPattern;

// here we use observer are subscriber they get notification of uploded video this way we use observer pattern in code.....

public class YT {
    public static void main(String[] args) {
        Channal Henil = new Channal();
        Subscriber s1 = new Subscriber("ram");
        Subscriber s2 = new Subscriber("hnd");
        Subscriber s3 = new Subscriber("adf");

        Henil.Subscibe(s1);
        Henil.Subscibe(s2);
        Henil.Subscibe(s3);

        s1.subscriberChannl(Henil);
        s2.subscriberChannl(Henil);
        s3.subscriberChannl(Henil);

        Henil.uplod("how achive goals in short time ?");

    }
}
