package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_Account_Activity2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account2);
        TextView password=findViewById(R.id.password);
        ImageView backarrowimg=findViewById(R.id.backarrowimg);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Account_Activity2.this,passwork_screen_Activity.class);
                startActivity(intent);
            }
        });
        backarrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_Account_Activity2.this,sign_pageActivity.class);
                startActivity(intent);
            }
        });
    }
}