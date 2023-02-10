package org.example.httpProtocol.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {

    public void error(String message) {
        System.err.println(now() + " ERROR: " + message);
    }

    public void info(String message) {
        System.out.println(now() + " INFO: " + message);
    }

    public void debug(String message) {
        System.out.println(now() + " DEBUG: " + message);
    }

    private String now() {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.format(now);
    }
}
