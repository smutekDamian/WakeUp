package com.wakeup.commons.entities;

import com.wakeup.commons.enums.Day;
import com.wakeup.commons.interfaces.Alarm;

import java.sql.Time;
import java.util.Map;

/**
 * Created by Jakub on 2016-10-30.
 */

public class StandardAlarm implements Alarm {

    private Integer alarmId;
    private Time alarmTime;
    private Map<Day,Boolean> actives;

    public StandardAlarm() {
        for(Day day: Day.values()){
            actives.put(day,false);
        }
    }

    @Override
    public Integer getAlarmId() {
        return alarmId;
    }


    @Override
    public Time getAlarmTime() {
        return alarmTime;
    }

    @Override
    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Map<Day, Boolean> getActives() {
        return actives;
    }

    public Boolean getDayActive(Day day){
        return actives.get(day);
    }

    public void setActives(Map<Day, Boolean> actives) {
        this.actives = actives;
    }
}
