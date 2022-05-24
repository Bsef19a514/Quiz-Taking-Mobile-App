package com.example.quiztakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        int score=intent.getIntExtra("Score",0);
        String msg;
        if(score>=7){
            msg="Congratulations, you have passed the exam. You got "+score+" out of 10.";
        }
        else{
            msg="Sorry, you could not make it. You got "+score+" out of 10.";
        }
        txtView=findViewById(R.id.textView2);
        txtView.setText(msg);
    }
}