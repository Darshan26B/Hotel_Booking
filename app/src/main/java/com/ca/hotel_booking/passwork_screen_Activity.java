package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class passwork_screen_Activity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwork_screen);
         TextView continue_btn=findViewById(R.id.continue_btn);
        ImageView backarrowimg=findViewById(R.id.backarrowimg);
        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(passwork_screen_Activity.this,OTP_Page_Activity.class);
                startActivity(intent);
            }
        });
        backarrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(passwork_screen_Activity.this,Login_Account_Activity2.class);
                startActivity(intent);
            }
        });

    }
}