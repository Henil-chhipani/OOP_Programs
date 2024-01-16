package Sigletonpattern;

import java.io.*;

public class Logger {

    private static Logger instance;

    private Logger(String m) {
        System.out.println("log message is :" + m);
    }

    public static Logger getInstance(String m) {
        if (instance == null) {
            instance = new Logger(m);
        }
        return instance;
    }

}
