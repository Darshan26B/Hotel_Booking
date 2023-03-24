package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class skipActivity3 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip3);
        ImageView Touch_Next2 = findViewById(R.id.Touch_Next2);
        LinearLayout skip3 = findViewById(R.id.skip3);
        Animation animation = AnimationUtils.loadAnimation(skipActivity3.this, R.anim.other_activity_anim);
        skip3.startAnimation(animation);
        Touch_Next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(skipActivity3.this, skipActivity4.class);
                startActivity(intent);
                finish();
            }
        });
    }
}