package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class My_bookmarkActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bookmark);
        ImageView save=findViewById(R.id.save);
       ImageView backarrowimg=findViewById(R.id.backarrowimg);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(My_bookmarkActivity.this,Recently_BookedActivity.class);
                startActivity(intent);
            }
        });
        backarrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(My_bookmarkActivity.this,Home_page_Activity.class);
                startActivity(intent);
            }
        });
    }
}