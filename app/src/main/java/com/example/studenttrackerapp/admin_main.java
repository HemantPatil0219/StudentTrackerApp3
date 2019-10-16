package com.example.studenttrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
    }

    public void btn_update_faculty(View view) {
    }

    public void btn_view_faculty(View view) {
        startActivity(new Intent(getApplicationContext(),admin_view_faculty.class));
    }


    public void btn_update_student(View view) {
    }

    public void btn_view_student(View view) {
        startActivity(new Intent(getApplicationContext(),admin_view_student.class));
    }


    public void btn_admin_logout(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
