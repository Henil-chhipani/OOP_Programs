package CommandPattern;

// in this we create coommand class and execute various command 
public class Home {
    public static void main(String[] args) {
        Remote r = new Remote();
        Light l = new Light();

        r.setCommand(new LightOn(l));
        r.buttonpress();

        r.setCommand(new Lightoff(l));
        r.buttonpress();
    }
}
