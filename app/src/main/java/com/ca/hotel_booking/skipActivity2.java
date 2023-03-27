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
import android.widget.TextView;

public class skipActivity2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip2);
        ImageView Touch_Next = findViewById(R.id.Touch_Next1);
        LinearLayout touch_scr = findViewById(R.id.touch_scr);
        Animation animation = AnimationUtils.loadAnimation(skipActivity2.this, R.anim.other_activity_anim);
        touch_scr.startAnimation(animation);

        Touch_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(skipActivity2.this, skipActivity3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
