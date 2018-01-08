package com.example.augappprototype.Listeners;

import android.app.Dialog;
import android.view.View;
import android.widget.Toast;

import com.example.augappprototype.MainActivity;
import com.example.augappprototype.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Pao on 1/7/2018.
 */

public class AddEventListener implements View.OnClickListener {
    public static HashMap<Date, ArrayList<String>> events = new HashMap<>();
    ArrayList<String> eventDetails = new ArrayList();

    private final MainActivity mainActivity;


    public AddEventListener(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        addEvents();
    }

    public void addEvents(){
        /**
        eventDetails.add(0, "Augustana");
        eventDetails.add(1, "Basketball Game");
        eventDetails.add(2, "Dennis Didusenko gonna dunk on mfers");
        events.put(new Date(118, 0, 1), eventDetails);
        Toast.makeText(mainActivity, "Event Added",
                Toast.LENGTH_SHORT).show();
         */

        final Dialog addEventDialog = new Dialog(mainActivity);
        addEventDialog.setContentView(R.layout.addeventpopup);
        addEventDialog.show();
    }

    public HashMap getEvents(){
        return events;
    }
}
