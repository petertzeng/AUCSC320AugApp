package com.example.augappprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.augappprototype.Listeners.GuestButtonListener;
import com.example.augappprototype.Listeners.LoginButtonListener;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new LoginButtonListener(this));
        Button continueAsGuestButton = findViewById(R.id.continueAsGuestButton);
        continueAsGuestButton.setOnClickListener(new GuestButtonListener(this));
    }
}
