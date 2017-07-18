package com.example.mapdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


public class LoginActivity extends AppCompatActivity {

    private CallbackManager callbackManager;
    private TextView info;
    private LoginButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        setContentView(R.layout.activity_login);
        info = (TextView) findViewById(R.id.info);
        loginButton = (LoginButton) findViewById(R.id.login_button);

    callbackManager = CallbackManager.Factory.create();

        // LoginManager.getInstance().registerCallback(callbackManager,
        //        new FacebookCallback<LoginResult>() {
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                info.setText("User ID:  " +
                        loginResult.getAccessToken().getUserId() + "\n" +
                        "Auth Token: " + loginResult.getAccessToken().getToken());
            //TODO: pass user ID to groups activity
                loginButton.setVisibility(View.INVISIBLE);
                toHomeGroupActivity();
                finish();
            }

            @Override
            public void onCancel() {
                info.setText("Cancelled Login Attempt");
            }

            @Override
            public void onError(FacebookException e) {
                info.setText("Failed Login Attempt");
            }
        });
    }

//method going to the groups activity
    private void toHomeGroupActivity() {
        Intent i = new Intent(LoginActivity.this, HomeGroupActivity.class);
        startActivity(i);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode, resultCode, data); //not sure if I need this
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}