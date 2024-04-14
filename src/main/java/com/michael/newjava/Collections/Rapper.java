package com.michael.newjava.Collections;

public class Rapper {
    private String name;
    private RapperStatus status;

    public Rapper(String name, RapperStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }


    public RapperStatus getStatus() {
        return status;
    }
}
