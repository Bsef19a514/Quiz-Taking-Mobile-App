package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity6 extends AppCompatActivity {
    String []answers=new String[10];
    String userName;
    RadioGroup rg7;
    RadioGroup rg8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent =getIntent();
        userName=intent.getStringExtra("username");
        answers=intent.getStringArrayExtra("answers");
    }
    public void gotoMainActivity5(View view){
//        Intent intent =new Intent(MainActivity6.this,MainActivity5.class);
//        startActivity(intent);
        finish();
    }

    public void gotoMainActivity7(View view){
        rg7 = findViewById(R.id.Q7);
        rg8 = findViewById(R.id.Q8);
        int id7=rg7.getCheckedRadioButtonId();
        int id8=rg8.getCheckedRadioButtonId();
        answers[6]="";
        answers[7]="";
        if(id7!=-1){
            answers[6] = (String) ((RadioButton) findViewById(id7)).getText();
        }
        if(id8!=-1){
            answers[7] = (String) ((RadioButton) findViewById(id8)).getText();
        }
        Intent intent =new Intent(MainActivity6.this,MainActivity7.class);
        intent.putExtra("username",userName);
        intent.putExtra("answers",answers);
        startActivity(intent);
    }
}