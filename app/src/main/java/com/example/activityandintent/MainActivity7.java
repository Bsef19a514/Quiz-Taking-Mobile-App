package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity7 extends AppCompatActivity {
    String []answers=new String[10];
    String userName;
    RadioGroup rg9;
    RadioGroup rg10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent intent =getIntent();
        userName=intent.getStringExtra("username");
        answers=intent.getStringArrayExtra("answers");
    }
    public void gotoMainActivity6(View view){
//        Intent intent =new Intent(MainActivity7.this,MainActivity6.class);
//        startActivity(intent);
        finish();
    }

    public void gotoMainActivity8(View view){
        rg9 = findViewById(R.id.Q9);
        rg10 = findViewById(R.id.Q10);
        int id9=rg9.getCheckedRadioButtonId();
        int id10=rg10.getCheckedRadioButtonId();
        answers[8]="";
        answers[9]="";
        if(id9!=-1){
            answers[8] = (String) ((RadioButton) findViewById(id9)).getText();
        }
        if(id10!=-1){
            answers[9] = (String) ((RadioButton) findViewById(id10)).getText();
        }
        Intent intent =new Intent(MainActivity7.this,MainActivity8.class);
        intent.putExtra("username",userName);
        intent.putExtra("answers",answers);
        startActivity(intent);
    }
}