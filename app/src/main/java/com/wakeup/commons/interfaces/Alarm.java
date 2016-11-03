package com.wakeup.commons.interfaces;

import java.sql.Time;

/**
 * Created by Jakub on 2016-10-30.
 */

public interface Alarm {

    Integer getAlarmId();

    void setAlarmTime(Time time);

    Time getAlarmTime();

}
