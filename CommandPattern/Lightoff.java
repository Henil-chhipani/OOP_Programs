package CommandPattern;

public class Lightoff extends Command {
    Light l;

    public Lightoff(Light l) {
        this.l = l;
    }

    @Override
    public void execute() {
        l.off();
    }
}
