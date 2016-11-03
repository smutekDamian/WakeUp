package com.wakeup.listeners;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.wakeup.activities.wakeup.R;

/**
 * Created by Jakub on 2016-10-31.
 */

public class SelectorLayoutListener implements View.OnClickListener {

    private LinearLayout defaultAlarmLayout;
    private FrameLayout placeAlarmLayout;
    private FrameLayout syncCalendarAlarmLayout;

    public SelectorLayoutListener(LinearLayout defaultAlarmLayout, FrameLayout placeAlarmLayout, FrameLayout syncCalendarAlarmLayout) {
        this.defaultAlarmLayout = defaultAlarmLayout;
        this.placeAlarmLayout = placeAlarmLayout;
        this.syncCalendarAlarmLayout = syncCalendarAlarmLayout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_default_alarm:
                defaultAlarmLayout.setVisibility(View.VISIBLE);
                placeAlarmLayout.setVisibility(View.INVISIBLE);
                syncCalendarAlarmLayout.setVisibility(View.INVISIBLE);
                break;
            case R.id.button_place_alarm:
                defaultAlarmLayout.setVisibility(View.INVISIBLE);
                placeAlarmLayout.setVisibility(View.VISIBLE);
                syncCalendarAlarmLayout.setVisibility(View.INVISIBLE);
                break;
            case R.id.button_sync_calendar_alarm:
                defaultAlarmLayout.setVisibility(View.INVISIBLE);
                placeAlarmLayout.setVisibility(View.INVISIBLE);
                syncCalendarAlarmLayout.setVisibility(View.VISIBLE);
                break;
        }
    }
}
