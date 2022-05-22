package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


import java.net.URI;

public class MainActivity extends AppCompatActivity {
TextView txtUname;
TextView txtPassword;
CheckBox chkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void CallingIntent(View view) {
//        Uri uri =  Uri.parse("tel:+923001234567");
//        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
//        startActivity(intent);
//    }
//    public void composeEmail(View view)
//    {
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setType("*/*");
//        intent.setData(Uri.parse("mailto:"));
//        intent.putExtra(Intent.EXTRA_EMAIL, "zainsattar17@gmail.com");
//        intent.putExtra(Intent.EXTRA_SUBJECT, "intents and activities");
//        intent.putExtra(Intent.EXTRA_TEXT,"Hi this is zain ahmad. how are you?");
//        startActivity(intent);
//    }

    public void gotoMainActivity2(View view){
        txtPassword=findViewById(R.id.pswd_txtBox);
        txtUname=findViewById(R.id.uname_txtBox);
        chkBox=findViewById(R.id.chkBox);
        String userName=txtUname.getText().toString();
        String password=txtPassword.getText().toString();
        boolean rememberMe=chkBox.isChecked();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        if(userName!=null && password !=null && rememberMe!=false) {
            intent.putExtra("username", userName);
            intent.putExtra("password", password);
            intent.putExtra("remember", rememberMe);
            startActivity(intent);

        }

    }


}