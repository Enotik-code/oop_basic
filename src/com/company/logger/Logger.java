package com.company.logger;

public class Logger {
    private static Logger instance = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void info(String message) {
        System.out.println(LoggerType.INFO.getType() + " : " + message);
    }

    public void info(Throwable message) {
        System.out.println(LoggerType.INFO.getType() + " : " + message);
    }

    public void warning(String message) {
        System.out.println(LoggerType.WARNING.getType() + " : " + message);
    }

    public void warning(Throwable message) {
        System.out.println(LoggerType.WARNING.getType() + " : " + message);
    }

    public void error(String message) {
        System.out.println(LoggerType.ERROR.getType() + " : " + message);
    }

    public void error(Throwable message) {
        System.out.println(LoggerType.ERROR.getType() + " : " + message);
    }
}
