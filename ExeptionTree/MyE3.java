package com.company.homework10.ExeptionTree;

public class MyE3 extends MyE1 {
    public MyE3() {
    }

    public MyE3(String message) {
        super(message);
    }

    public MyE3(String message, Throwable cause) {
        super(message, cause);
    }

    public MyE3(Throwable cause) {
        super(cause);
    }

    public MyE3(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
