package com.example.augappprototype;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

public class MainActivity extends AppCompatActivity implements DayViewDecorator {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialCalendarView materialCalendar = findViewById(R.id.calendarView);
        materialCalendar.state().edit()
                .setMinimumDate(CalendarDay.from(2017, 12, 31))
                .setMaximumDate(CalendarDay.from(2018, 12, 31))
                .commit();
       // materialCalendar.addDecorators(new CurrentDayDecorator(this));

        materialCalendar.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                final Dialog d = new Dialog(MainActivity.this);
                d.setContentView(R.layout.eventpopup);
                d.show();
                Button close_btn = d.findViewById(R.id.bottom);
                close_btn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        d.dismiss();
                    }
                });
            }
        });
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
