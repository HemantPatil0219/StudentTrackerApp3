package com.example.studenttrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class faculty_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);
    }

    public void btn_faculty_signup(View view) {
        startActivity(new Intent(getApplicationContext(),Sign_up_faculty.class));
    }
}
