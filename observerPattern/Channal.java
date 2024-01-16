package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Channal {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public void Subscibe(Subscriber sub) {
        subs.add(sub);
    }

    public void unSubscibe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubscriber() {
        for (Subscriber sub : subs) {
            sub.update();
        }
    }

    public void uplod(String title) {
        this.title = title;
        notifySubscriber();
    }
}
