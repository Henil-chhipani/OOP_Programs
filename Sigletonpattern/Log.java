package Sigletonpattern;

public class Log {
    public static void main(String[] args) {
        String m = "Hello log";
        Logger log1 = Logger.getInstance(m);
    }
}
