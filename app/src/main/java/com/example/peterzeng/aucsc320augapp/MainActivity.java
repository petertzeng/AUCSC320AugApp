package com.example.peterzeng.aucsc320augapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
    GoogleApiClient.OnConnectionFailedListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  } // onCreate(Bundle)

  @Override
  public void onClick(View v) {

  } // onClick(View)

  @Override
  public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

  } // onConnectionFailed(ConnectionResult)
} // MainActivity