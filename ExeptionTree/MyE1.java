package com.company.homework10.ExeptionTree;

public class MyE1 extends Exception {
    public MyE1() {
    }

    public MyE1(String message) {
        super(message);
    }

    public MyE1(String message, Throwable cause) {
        super(message, cause);
    }

    public MyE1(Throwable cause) {
        super(cause);
    }

    public MyE1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
