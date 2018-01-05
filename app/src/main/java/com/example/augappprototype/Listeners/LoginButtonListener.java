package com.example.augappprototype.Listeners;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.augappprototype.MainActivity;

/**
 * Created by ZachyZachy7 on 2018-01-05.
 */

public class LoginButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.i("clicks","You Clicked B1");
        Intent i=new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
}
