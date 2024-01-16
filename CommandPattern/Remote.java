package CommandPattern;

public class Remote {
    Command s;

    void setCommand(Command s) {
        this.s = s;
    }

    void buttonpress() {
        s.execute();
    }
}
