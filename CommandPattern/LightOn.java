package CommandPattern;

public class LightOn extends Command {
    Light l;

    public LightOn(Light l) {
        this.l = l;
    }

    @Override
    public void execute() {
        l.on();
    }
}
