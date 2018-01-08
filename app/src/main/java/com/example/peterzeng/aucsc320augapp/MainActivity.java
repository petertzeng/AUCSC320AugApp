package com.example.peterzeng.aucsc320augapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
    GoogleApiClient.OnConnectionFailedListener {

  private Button signOut;
  private GoogleApiClient googleApiClient;
  private ImageView profilePicture;
  private LinearLayout profileSection;
  private SignInButton signIn;
  private TextView email;
  private TextView name;
  private static final int REQUEST_CODE = 9001;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    profileSection = (LinearLayout)findViewById(R.id.profile_section);
    signOut = (Button)findViewById(R.id.logout_button);
    signIn = (SignInButton)findViewById(R.id.login_button);
    name = (TextView)findViewById(R.id.name);
    email = (TextView)findViewById(R.id.email);
    profilePicture = (ImageView)findViewById(R.id.profile_picture);
    signIn.setOnClickListener(this);
    signOut.setOnClickListener(this);


  } // onCreate(Bundle)

  @Override
  public void onClick(View v) {

  } // onClick(View)

  @Override
  public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

  } // onConnectionFailed(ConnectionResult)

} // MainActivity