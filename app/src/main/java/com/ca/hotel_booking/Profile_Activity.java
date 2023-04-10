package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile_Activity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView Profile_img=findViewById(R.id.Profile_img);
        TextView continue_password_btn=findViewById(R.id.continue_password_btn);
        ImageView backarrowimg=findViewById(R.id.backarrowimg);
        continue_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_Activity.this,Home_page_Activity.class);
                startActivity(intent);
            }
        });
        backarrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_Activity.this,creat_new_passwordActivity.class);
                startActivity(intent);
            }
        });
    }
}