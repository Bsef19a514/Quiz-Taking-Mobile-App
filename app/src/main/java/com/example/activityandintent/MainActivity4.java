package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity4 extends AppCompatActivity {
    String userName;
    String a1;
    String a2;
    RadioGroup rg3;
    RadioGroup rg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent =getIntent();
        userName=intent.getStringExtra("username");
        a1=intent.getStringExtra("q1");
        a2=intent.getStringExtra("q2");

    }
    public void gotoMainActivity3(View view){
        finish();
    }

    public void gotoMainActivity5(View view){
        rg3 = findViewById(R.id.Q3);
        rg4 = findViewById(R.id.Q4);
        int id3 =rg3.getCheckedRadioButtonId();
        int id4 =rg4.getCheckedRadioButtonId();
        String a3="";
        String a4="";
        if(id3!=-1){
            a3 = (String) ((RadioButton) findViewById(id3)).getText();
        }
        if(id4!=-1){
            a4 = (String) ((RadioButton) findViewById(id4)).getText();
        }
        Intent intent =new Intent(MainActivity4.this,MainActivity5.class);
        intent.putExtra("username",userName);
        intent.putExtra("q1",a1);
        intent.putExtra("q2",a2);
        intent.putExtra("q3",a3);
        intent.putExtra("q4",a4);
        startActivity(intent);
    }
}