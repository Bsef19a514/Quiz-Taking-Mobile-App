package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity5 extends AppCompatActivity {
    String []answers=new String[10];
    String userName;
    RadioGroup rg5;
    RadioGroup rg6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent intent =getIntent();
        userName=intent.getStringExtra("username");
        answers[0]=intent.getStringExtra("q1");
        answers[1]=intent.getStringExtra("q2");
        answers[2]=intent.getStringExtra("q3");
        answers[3]=intent.getStringExtra("q4");
    }
    public void gotoMainActivity4(View view){
        finish();
    }

    public void gotoMainActivity6(View view){
        rg5 = findViewById(R.id.Q5);
        rg6 = findViewById(R.id.Q6);
        int id5=rg5.getCheckedRadioButtonId();
        int id6=rg6.getCheckedRadioButtonId();
        answers[4]="";
        answers[5]="";
        if (id5 != -1) {
            answers[4] = (String) ((RadioButton) findViewById(id5)).getText();
        }
        if(id6!=-1){
            answers[5] = (String) ((RadioButton) findViewById(id6)).getText();
        }
        Intent intent =new Intent(MainActivity5.this,MainActivity6.class);
        intent.putExtra("username",userName);
        intent.putExtra("answers",answers);
        startActivity(intent);
    }
}