package com.wakeup.commons.entities;

import com.wakeup.commons.interfaces.Alarm;

import java.sql.Time;

/**
 * Created by Jakub on 2016-10-30.
 */
//TODO
public class CalendarSyncAlarm implements Alarm {

    private Integer alarmId;
    private Time alarmTime;

    public CalendarSyncAlarm() {
    }

    @Override
    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public Time getAlarmTime() {
        return alarmTime;
    }

    @Override
    public Integer getAlarmId() {
        return alarmId;
    }
}
