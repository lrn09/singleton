package creational.singleton;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private final String timeStamp;

    private Logger() {
        this.timeStamp = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + timeStamp + " " + num++ + "] " + msg);
    }
}
