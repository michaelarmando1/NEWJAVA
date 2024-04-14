package com.michael.newjava.Assignments;

public class EventAttendees {
    private String name;
    private Category section;

    public EventAttendees(String name, Category options) {
        this.name = name;
        this.section = options;
    }

    public String getName() {
        return name;
    }

    public Category getSection() {
        return section;
    }

}
