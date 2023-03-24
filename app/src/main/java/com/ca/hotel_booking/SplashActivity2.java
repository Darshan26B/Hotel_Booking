package com.ca.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.util.Half;
import android.widget.TextView;

public class SplashActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        TextView splash_scr=findViewById(R.id.splash_scr);
        Animation splash_screen = AnimationUtils.loadAnimation(SplashActivity2.this, R.anim.splash_screen);
        splash_scr.startAnimation(splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new  Intent(SplashActivity2.this,MainActivity.class));
                finish();
            }
        },3000);
    }
}