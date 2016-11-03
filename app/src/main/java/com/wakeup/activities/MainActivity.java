package com.wakeup.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.wakeup.activities.wakeup.R;
import com.wakeup.listeners.SelectorLayoutListener;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout defaultAlarmLayout = (LinearLayout) findViewById(R.id.layout_default_alarm);
        FrameLayout placeAlarmLayout = (FrameLayout) findViewById(R.id.layout_place_alarm);
        FrameLayout syncCalendarAlarmLayout = (FrameLayout) findViewById(R.id.layout_sync_calendar_alarm);

        SelectorLayoutListener layoutListener = new SelectorLayoutListener(defaultAlarmLayout,
                placeAlarmLayout,syncCalendarAlarmLayout);

        Button defaultAlarmButton = (Button) findViewById(R.id.button_default_alarm);
        Button placeAlarmButton = (Button) findViewById(R.id.button_place_alarm);
        Button syncCalendarAlarmButton = (Button) findViewById(R.id.button_sync_calendar_alarm);

        defaultAlarmButton.setOnClickListener(layoutListener);
        placeAlarmButton.setOnClickListener(layoutListener);
        syncCalendarAlarmButton.setOnClickListener(layoutListener);
    }



}
