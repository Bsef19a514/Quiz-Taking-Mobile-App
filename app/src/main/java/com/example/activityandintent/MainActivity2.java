package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity2 extends AppCompatActivity {

TextView txt1;
String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=findViewById(R.id.msg_txtBox);
        Intent intent=getIntent();
        userName=intent.getStringExtra(("username"));
        txt1.setText("Welcome "+userName);
    }
    public void gotoMainActivity3(View view){
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("username",userName);
        startActivity(intent);
    }
}