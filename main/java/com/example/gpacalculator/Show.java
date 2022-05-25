package com.example.gpacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Show extends MainActivity {

    String letter ;
    TextView show2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        btn = findViewById(R.id.button3);

        show2 = findViewById(R.id.textView4);
        double hours =ga10 + ga20 + ga30 + ga40 + ga50 + ga60;

        String pointLetter = "";
        if (resH >=3.67)
            pointLetter = "A";
        else if(resH >=3)
            pointLetter = "B";
        else if(resH >=2.33)
            pointLetter = "C";
        else if(resH >=2)
            pointLetter = "D";
        else
            pointLetter = "";
        show2.setText("GPA in this Semester : \n"+
                String.format("%.2f", resH)+" : "+pointLetter+
                "\nTotal Hours : "+hours+
                "\n\nGrade "+name1+" : "+resultLetter(ga1)+
                "\n\nGrade "+name2+" : "+resultLetter(ga2)+
                "\n\nGrade "+name3+" : "+resultLetter(ga3)+
                "\n\nGrade "+name4+" : "+resultLetter(ga4)+
                "\n\nGrade "+name5+" : "+resultLetter(ga5)+
                "\n\nGrade "+name6+" : "+resultLetter(ga6));

        if (resH>3) {

            Toast.makeText(Show.this, "Congratulations", Toast.LENGTH_LONG).show();
        }
    }
    public void enter3 (View view){

        Intent enter = new Intent(this, calc.class);
        startActivity(enter);
        finish();

    }
    public String resultLetter(double grade) {
        if (grade >= 90) {
            letter = "A";
        } else if (grade >= 82) {
            letter = "B+";
        } else if (grade >= 74) {
            letter = "B";
        } else if (grade >= 66) {
            letter = "C+";
        } else if (grade >= 58) {
            letter = "C";
        } else if (grade >= 50) {
            letter = "D";
        } else if (grade < 50 && grade>0) {
            letter = "F";
        }
        else
            letter = "";

        return letter;
    }
}