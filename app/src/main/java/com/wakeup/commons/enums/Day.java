package com.wakeup.commons.enums;

/**
 * Created by Jakub on 2016-10-31.
 */

public enum Day {

    MONDAY("MON",0),
    TUESDAY("TUE",1),
    WEDNESDAY("WED",2),
    THURSDAY("THU",3),
    FRIDAY("FRI",4),
    SATURDAY("SAT",5),
    SUNDAY("SUN",6);


    private final String shortcut;
    private final Integer number;

    Day(String shortcut, Integer number){
        this.shortcut = shortcut;
        this.number = number;
    }

    public String getShortcut() {
        return shortcut;
    }

    public Integer getNumber() {
        return number;
    }
}
