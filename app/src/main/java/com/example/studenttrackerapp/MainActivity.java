package com.example.studenttrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_faculty(View view) {
        startActivity(new Intent(getApplicationContext(),faculty_login.class));
    }

    public void btn_student(View view) {
        startActivity(new Intent(getApplicationContext(),student_login.class));

    }
}
