package com.loveeconomy.loveeconomy;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;

public class SignUpActivity extends AppCompatActivity{

    private EditText emailField;
    private EditText passwordField;
    private Button signInBtn;

    private RequestQueue serverRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailField = (EditText)findViewById(R.id.email);
    }
}
