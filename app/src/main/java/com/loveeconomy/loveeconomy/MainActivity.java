package com.loveeconomy.loveeconomy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    public void RedirectToDashboard(){
        Intent  dashboard = new Intent(getApplicationContext(), Dashboard.class);
        startActivity(dashboard);
    }

    public void RedirectToLogin(){
        Intent  signIn = new Intent(getApplicationContext(), SignInActivity.class);
        startActivity(signIn);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);

        SharedPreferences activeSession = this.getSharedPreferences("com.loveeconomy.loveeconomy", Context.MODE_PRIVATE);
        String token = activeSession.getString("auth_token", "");

        if (!Objects.equals("", token)){
            RedirectToDashboard();
        }else{
            RedirectToLogin();
        }
    }
}
