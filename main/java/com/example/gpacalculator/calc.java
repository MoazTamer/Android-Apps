package com.example.gpacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class calc extends  AppCompatActivity{

    static String courseName1 ;
    static String courseName2 ;
    static String courseName3 ;
    static String courseName4 ;
    static String courseName5 ;
    static String courseName6 ;
    EditText course1 ,course2,course3,course4,course5,course6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        course1 = findViewById(R.id.course1);
        course2 = findViewById(R.id.course2);
        course3 = findViewById(R.id.course3);
        course4 = findViewById(R.id.course4);
        course5 = findViewById(R.id.course5);
        course6 = findViewById(R.id.course6);

    }

    public void enter2 (View view){

        courseName1 = course1.getText().toString();
        courseName2 = course2.getText().toString();
        courseName3 = course3.getText().toString();
        courseName4 = course4.getText().toString();
        courseName5 = course5.getText().toString();
        courseName6 = course6.getText().toString();

        if(TextUtils.isEmpty(courseName1))
            courseName1 = "";
        if(TextUtils.isEmpty(courseName2))
            courseName2 = "";
        if(TextUtils.isEmpty(courseName3))
            courseName3 = "";
        if(TextUtils.isEmpty(courseName4))
            courseName4 = "";
        if(TextUtils.isEmpty(courseName5))
            courseName5 = "";
        if(TextUtils.isEmpty(courseName6))
              courseName6 = "";
        Intent enter = new Intent(this, MainActivity.class);
        startActivity(enter);

    }
}