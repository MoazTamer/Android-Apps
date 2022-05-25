package com.example.gpacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends calc {

    public static String g1 ,g2,g3,g4,g5,g6, g10 ,g20,g30,g40,g50,g60;
    public static double ga1 , ga2 , ga3 , ga4 , ga5 , ga6 ,ga10 , ga20 , ga30 , ga40 , ga50 , ga60 ;
    public static double gpa1 , gpa2 , gpa3 , gpa4 , gpa5 , gpa6 ,resH;

    String  name1 = courseName1;
    String  name2 = courseName2;
    String  name3 = courseName3;
    String  name4 = courseName4;
    String  name5 = courseName5;
    String  name6 = courseName6;

    EditText grade1, grade2,grade3,grade4,grade5,grade6 , gradegpa1, gradegpa2,gradegpa3,gradegpa4,gradegpa5,gradegpa6 ;
    double gpa ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grade1 = findViewById(R.id.editTextNumberDecimal1);
        grade2 = findViewById(R.id.editTextNumberDecimal2);
        grade3 = findViewById(R.id.editTextNumberDecimal3);
        grade4 = findViewById(R.id.editTextNumberDecimal4);
        grade5 = findViewById(R.id.editTextNumberDecimal5);
        grade6 = findViewById(R.id.editTextNumberDecimal6);

        grade1.setHint("Enter Grade "+name1);
        grade2.setHint("Enter Grade "+name2);
        grade3.setHint("Enter Grade "+name3);
        grade4.setHint("Enter Grade "+name4);
        grade5.setHint("Enter Grade "+name5);
        grade6.setHint("Enter Grade "+name6);

        gradegpa1 = findViewById(R.id.editTextNumberDecimal10);
        gradegpa2 = findViewById(R.id.editTextNumberDecimal20);
        gradegpa3 = findViewById(R.id.editTextNumberDecimal30);
        gradegpa4 = findViewById(R.id.editTextNumberDecimal40);
        gradegpa5 = findViewById(R.id.editTextNumberDecimal50);
        gradegpa6 = findViewById(R.id.editTextNumberDecimal60);

        gradegpa1.setHint("Hours "+name1);
        gradegpa2.setHint("Hours "+name2);
        gradegpa3.setHint("Hours "+name3);
        gradegpa4.setHint("Hours "+name4);
        gradegpa5.setHint("Hours "+name5);
        gradegpa6.setHint("Hours "+name6);


    }
    // Button Enter  "Next"
    public void enter (View view){

        // كتابة صفر عند عدد الساعات الفاضية

        if(TextUtils.isEmpty(name1))
            gradegpa1.setHint("0");
        if(TextUtils.isEmpty(name2))
            gradegpa2.setHint("0");
        if(TextUtils.isEmpty(name3))
            gradegpa3.setHint("0");
        if(TextUtils.isEmpty(name4))
            gradegpa4.setHint("0");
        if(TextUtils.isEmpty(name5))
            gradegpa5.setHint("0");
        if(TextUtils.isEmpty(name6))
            gradegpa6.setHint("0");

        // كتابة صفر عند الدرجات الفاضية

        if(TextUtils.isEmpty(name1)) {
            grade1.setHint("0");
            g1 = "0";
        }if(TextUtils.isEmpty(name2)){
            grade2.setHint("0");
            g1 = "0";
        }if(TextUtils.isEmpty(name3)){
            grade3.setHint("0");
            g1 = "0";
        }if(TextUtils.isEmpty(name4)){
            grade4.setHint("0");
            g1 = "0";
        }if(TextUtils.isEmpty(name5)){
            grade5.setHint("0");
            g1 = "0";
        }if(TextUtils.isEmpty(name6)){
            grade6.setHint("0");
            g1 = "0";
        }

        g1 = grade1.getText().toString();
        g2 = grade2.getText().toString();
        g3 = grade3.getText().toString();
        g4 = grade4.getText().toString();
        g5 = grade5.getText().toString();
        g6 = grade6.getText().toString();

        g10 = gradegpa1.getText().toString();
        g20 = gradegpa2.getText().toString();
        g30 = gradegpa3.getText().toString();
        g40 = gradegpa4.getText().toString();
        g50 = gradegpa5.getText().toString();
        g60 = gradegpa6.getText().toString();

        //تحويل قيمة الدرجات للمتغير ga1

        ga1 = Double.parseDouble(g1);
        ga2 = Double.parseDouble(g2);
        ga3 = Double.parseDouble(g3);
        ga4 = Double.parseDouble(g4);
        ga5 = Double.parseDouble(g5);
        ga6 = Double.parseDouble(g6);

        //تحويل قيمة عدد الساعات للمتغير ga1

        ga10 = Double.parseDouble(g10);
        ga20 = Double.parseDouble(g20);
        ga30 = Double.parseDouble(g30);
        ga40 = Double.parseDouble(g40);
        ga50 = Double.parseDouble(g50);
        ga60 = Double.parseDouble(g60);

        double totalGrades = ga1 + ga2 +ga3 + ga4 + ga5 +ga6 ;

        gpa1 = result(ga1) * ga10 ;
        gpa2 = result(ga2) * ga20 ;
        gpa3 = result(ga3) * ga30 ;
        gpa4 = result(ga4) * ga40 ;
        gpa5 = result(ga5) * ga50 ;
        gpa6 = result(ga6) * ga60 ;

        // calc gpa

        resH = (gpa1+gpa2+gpa3+gpa4+gpa5+gpa6) / (ga10+ga20+ga30+ga40+ga50+ga60);

        Intent enter = new Intent(this, Show.class);
        startActivity(enter);
    }
    public double result(double grade) {
        if (grade >= 90) {
            gpa = 4.0;
        } else if (grade >= 82) {
            gpa = 3.5;
        } else if (grade >= 74) {
            gpa = 3.0;
        } else if (grade >= 66) {
            gpa = 2.5;
        } else if (grade >= 58) {
            gpa = 2.0;
        } else if (grade >= 50) {
            gpa = 1.5;
        } else if (grade < 50) {
            gpa = 0;
        }
        else
            gpa = 0;

        return gpa;
    }
}