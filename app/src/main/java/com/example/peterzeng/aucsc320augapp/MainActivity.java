package com.example.peterzeng.aucsc320augapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
    GoogleApiClient.OnConnectionFailedListener {

  private LinearLayout profileSection;
  private Button signOut;
  private SignInButton signIn;
  private TextView name;
  private TextView profilePicture;
  private GoogleApiClient googleApiClient;
  private static final int REQUEST_CODE = 9001;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    profileSection = (LinearLayout)findViewById(R.id.profile_section);
    signOut = (Button)findViewById(R.id.logout_button);
    signIn = (SignInButton)findViewById(R.id.login_button);

  } // onCreate(Bundle)

  @Override
  public void onClick(View v) {

  } // onClick(View)

  @Override
  public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

  } // onConnectionFailed(ConnectionResult)

} // MainActivity