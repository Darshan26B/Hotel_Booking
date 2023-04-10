package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class sign_pageActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_page);
        TextView sign_in_with_pw_btn = findViewById(R.id.sign_in_with_pw_btn);
        ImageView backarrowimg = findViewById(R.id.backarrowimg);
        sign_in_with_pw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sign_pageActivity.this, Login_Account_Activity2.class);
                startActivity(intent);
                finish();
            }
        });
        backarrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sign_pageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}