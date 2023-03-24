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

public class skipActivity4 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip4);
       ImageView Touch_Next_finish = findViewById(R.id.Touch_Next_finish);
        LinearLayout skip4 = findViewById(R.id.skip4);
        Animation animation = AnimationUtils.loadAnimation(skipActivity4.this, R.anim.other_activity_anim);
        skip4.startAnimation(animation);
        Touch_Next_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(skipActivity4.this,sign_pageActivity.class);
                startActivity(intent);
            }
        });
    }
}