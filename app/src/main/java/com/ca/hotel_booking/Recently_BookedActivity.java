package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Recently_BookedActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_booked);
        ImageView continue_password_btn = findViewById(R.id.book_mark_icon);
        ImageView backarrowimg = findViewById(R.id.backarrowimg);
        continue_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Recently_BookedActivity.this, My_bookmarkActivity.class);
                startActivity(intent);
            }
        });
        backarrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Recently_BookedActivity.this, Home_page_Activity.class);
                startActivity(intent);
            }
        });
    }
}