package com.company.homework10.ExeptionTree;

public class MyE2 extends Exception {
    public MyE2() {
    }

    public MyE2(String message) {
        super(message);
    }

    public MyE2(String message, Throwable cause) {
        super(message, cause);
    }

    public MyE2(Throwable cause) {
        super(cause);
    }

    public MyE2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
