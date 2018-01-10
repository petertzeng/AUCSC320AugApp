package com.example.augappprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.augappprototype.Listeners.EventCalendarListener;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        findViewById(R.id.eventsCalendarImage).setOnClickListener(new EventCalendarListener(this));

    }
}
