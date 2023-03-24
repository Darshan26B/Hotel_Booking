package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView get_started_btn = findViewById(R.id.get_started_btn);
        LinearLayout full_scr=findViewById(R.id.full_scr);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.other_activity_anim);
        get_started_btn.startAnimation(animation);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.other_activity_anim);
        full_scr.startAnimation(anim);

        get_started_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,skipActivity2.class);
                startActivity(intent);
            }
        });
    }
}