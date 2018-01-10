package com.example.augappprototype.Listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.augappprototype.LoginScreen;
import com.example.augappprototype.MainMenu;
import com.example.augappprototype.MainActivity;
import com.example.augappprototype.R;

/**
 * Created by Pao on 1/7/2018.
 */

public class GuestButtonListener extends MainActivity implements View.OnClickListener{

    private LoginScreen loginScreen;

    public GuestButtonListener(LoginScreen loginScreen){
        this.loginScreen = loginScreen;
    }

    @Override
    public void onClick(View v) {
        isGuest = true;
        Toast.makeText(loginScreen, "Logged in as a guest",
                Toast.LENGTH_LONG).show();
        Intent goToMainMenu = new Intent(loginScreen, MainMenu.class);
        loginScreen.startActivity(goToMainMenu);
    }




}
