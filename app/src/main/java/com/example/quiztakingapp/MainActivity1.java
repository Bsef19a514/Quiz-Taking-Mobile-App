package com.example.quiztakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;


public class MainActivity1 extends AppCompatActivity {
    TextView txtView;
    RadioGroup radiogrp;
    RadioButton rb[]=new RadioButton[3];
    Button prevBtn;
    Question []q=new Question[10];
    int counter=0;
    int randomNmbr;
    int optionIterator;
    String []selectedOptions=new String[10];
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Intent intent =getIntent();

        for (int i=0;i<10;i++){
            q[i]=new Question();
            q[i].options=new String[2];
        }
        q[0].question="In which HTML tag do we put the JS code?";
        q[0].insertOption(0,"link tag");
        q[0].insertOption(1,"js tag");
        q[0].correctOption="script tag";

        q[1].question="Which object is in the top of the root of JavaScript?";
        q[1].insertOption(0,"document");
        q[1].insertOption(1,"URL");
        q[1].correctOption="window";

        q[2].question="Which event do you use to perform something after the page has finished loading?";
        q[2].insertOption(0,"onfinished");
        q[2].insertOption(1,"oncomplete");
        q[2].correctOption="onload";

        q[3].question="DOM is ??";
        q[3].insertOption(0,"dedicated for JS");
        q[3].insertOption(1,"a template engine");
        q[3].correctOption="describes the structure of HTML or XML document";

        q[4].question="Which of the following is not a property of window object?";
        q[4].insertOption(0,"navigator");
        q[4].insertOption(1,"history");
        q[4].correctOption="menu";

        q[5].question="Which of the following is not a valid mouse event?";
        q[5].insertOption(0,"onmouseover");
        q[5].insertOption(1,"onmousemove");
        q[5].correctOption="onmouseScroller";

        q[6].question="Which one is not a valid function call?";
        q[6].insertOption(0,"var x = display()");
        q[6].insertOption(1,"display()");
        q[6].correctOption="display";

        q[7].question="Which function does the reverse of split?";
        q[7].insertOption(0,"concat");
        q[7].insertOption(1,"bind");
        q[7].correctOption="join";

        q[8].question="When we can't trigger JS from an event handler?";
        q[8].insertOption(0,"when it runs rather than on the web");
        q[8].insertOption(1,"when another event is still being processed");
        q[8].correctOption="when JsvaScript is disabled";

        q[9].question="The following statement A ? B : C is equivalent to?";
        q[9].insertOption(0,"if (A) (B:C)");
        q[9].insertOption(1,"if(A) (B) else (C)");
        q[9].correctOption="if(A)(B) else (C)";

        txtView=findViewById(R.id.textView);
        radiogrp=findViewById(R.id.radiogroup);
        rb[0]=findViewById(R.id.radioButton);
        rb[1]=findViewById(R.id.radioButton2);
        rb[2]=findViewById(R.id.radioButton3);
        prevBtn=findViewById(R.id.button2);

        displayQuestion();

    }
    public void displayQuestion(){
        if(counter<=9) {
            txtView.setText("Q" + (counter + 1) + ". " + q[counter].question);
            randomNmbr = (int) (Math.floor(Math.random() * 3));
            rb[randomNmbr].setText(q[counter].correctOption);
            optionIterator = 0;
            for (int i = 0; i < 3; i++) {
                if (i != randomNmbr) {
                    rb[i].setText(q[counter].options[optionIterator]);
                    optionIterator++;
                }
            }

        }

    }
    int selectedOptionIterator=0;
    public void displayNextQuestion(View view){
        counter++;
        int id=radiogrp.getCheckedRadioButtonId();
        //System.out.println("Selected id is: "+id);
        if(id!=-1) {
            RadioButton btn= findViewById(id);
            //System.out.println(btn.getText());
            selectedOptions[selectedOptionIterator] = (String) ((RadioButton) findViewById(id)).getText();
            System.out.println("Selected option is: "+selectedOptions[selectedOptionIterator]);
        }
        selectedOptionIterator++;
        if(counter==10){
            finishAttempt();
        }
        else {
            radiogrp.clearCheck();
            displayQuestion();
        }
    }

    public void displayPrevQuestion(View view) {
        if(counter>=1){
            counter--;
            displayQuestion();
            for(int i=0;i<3;i++){
                if(rb[i].getText().equals(q[counter].correctOption)){
                    rb[i].setChecked(true);
                }
            }

        }
    }
    public void finishAttempt(){
        int score=0;
        for(int i=0;i<10;i++){
            if(q[i].correctOption.equals(selectedOptions[i])){
                score++;
            }
        }
        Intent intent =new Intent(MainActivity1.this,MainActivity2.class);
        intent.putExtra("Score",score);
        startActivity(intent);

    }
}

