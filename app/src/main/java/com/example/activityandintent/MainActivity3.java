package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity3 extends AppCompatActivity {
String userName;
RadioGroup rg1;
RadioGroup rg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent =getIntent();
        userName=intent.getStringExtra("username");
    }
    public void gotoMainActivity2(View view){
        finish();
    }
    public void gotoMainActivity4(View view){
        rg1 = findViewById(R.id.Q1);
        rg2 = findViewById(R.id.Q2);
        int selectedID1 =rg1.getCheckedRadioButtonId();
        int selectedID2 =rg2.getCheckedRadioButtonId();
        String text1="",text2="";
        if(selectedID1!=-1){
            text1 = (String) ((RadioButton) findViewById(selectedID1)).getText();
        }
        if(selectedID2!=-1){
            text2 = (String) ((RadioButton) findViewById(selectedID2)).getText();
        }
        Intent intent =new Intent(MainActivity3.this,MainActivity4.class);
        intent.putExtra("username",userName);
        intent.putExtra("q1",text1);
        intent.putExtra("q2",text2);
        startActivity(intent);
    }
}