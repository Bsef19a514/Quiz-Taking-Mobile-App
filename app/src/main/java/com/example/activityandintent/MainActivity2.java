package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity2 extends AppCompatActivity {
Button btn;
TextView txt1;
TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=findViewById(R.id.msg_txtBox);
        Intent intent=getIntent();
        String userName=intent.getStringExtra(("username"));
        txt1.setText("Welcome "+userName);
        Intent intent2=new Intent(MainActivity2.this,)


    }
}