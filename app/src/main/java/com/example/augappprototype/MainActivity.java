package com.example.augappprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class MainActivity extends AppCompatActivity implements DayViewDecorator {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialCalendarView materialCalendar = (MaterialCalendarView)findViewById(R.id.calendarView);
        materialCalendar.state().edit()
                .setMinimumDate(CalendarDay.from(2017, 12, 31))
                .setMaximumDate(CalendarDay.from(2018, 12, 31))
                .commit();
        materialCalendar.setDynamicHeightEnabled(true);
    }


    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return false;
    }

    @Override
    public void decorate(DayViewFacade view) {

    }
}

/**
<com.prolificinteractive.materialcalendarview.MaterialCalendarView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/calendarView"
        android:layout_width="0dp"
        android:layout_height="0dp"

        app:layout_constraintBottom_toTopOf="@id/bottom"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@id/top"
        app:mcv_selectionColor="#00F"
        app:mcv_showOtherDates="all"
        app:mcv_tileHeight="70dp" />
 */
