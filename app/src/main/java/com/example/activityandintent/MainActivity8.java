package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
    String userName;
    TextView txtView;
    String []answers=new String[10];
    String []originalAnswers={"script tag","Window","onLoad","Menu"," display;","join()","describes the structure of the HTML or XML document","onmousescroller","when Javascript is disabled","if (A) {B} else {C}"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Intent intent =getIntent();
        userName=intent.getStringExtra("username");
        answers=intent.getStringArrayExtra("answers");
        int score=0;
        for(int i=0;i<10;i++){
            if(originalAnswers[i].equals(answers[i])){
                score++;
            }
        }
        String msg;
        if(score>=7){
            msg="Congratulations "+userName+". You have passed the exam. You got "+score+" out of 10.";
        }else{
            msg="Sorry "+userName+". You could not make it. You got "+score+" out of 10.";
        }
        txtView=findViewById(R.id.msg);
        txtView.setText(msg);
    }
}