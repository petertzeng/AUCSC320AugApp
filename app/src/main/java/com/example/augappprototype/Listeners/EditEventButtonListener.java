package com.example.augappprototype.Listeners;

import android.app.Dialog;
import android.view.View;

import com.example.augappprototype.MainActivity;
import com.example.augappprototype.R;

/**
 * Created by Pao on 1/9/2018.
 */

public class EditEventButtonListener implements View.OnClickListener {
    private final MainActivity mainActivity;

    public EditEventButtonListener(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        final Dialog addEventDialog = new Dialog(mainActivity);
        addEventDialog.setContentView(R.layout.edit_event);
        addEventDialog.show();
    }
}
