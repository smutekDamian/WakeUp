package com.wakeup.commons.entities;

import com.google.android.gms.maps.model.LatLng;
import com.wakeup.commons.enums.Day;
import com.wakeup.commons.interfaces.Alarm;
import java.sql.Time;
import java.util.Map;


/**
 * Created by Jakub on 2016-10-30.
 */

public class PlaceAlarm implements Alarm {

    private Integer alaramId;
    private Time alarmTime;
    private LatLng location;

    @Override
    public Integer getAlarmId() {
        return alaramId;
    }

    @Override
    public Time getAlarmTime() {
        return alarmTime;
    }

    @Override
    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }
}
