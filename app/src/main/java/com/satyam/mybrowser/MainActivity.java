package com.satyam.mybrowser;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2 = findViewById(R.id.imageView2);
        Animation move = AnimationUtils.loadAnimation(this,R.anim.move);
         imageView2.startAnimation(move);
        new Handler().postDelayed(() -> startActivity(new Intent(MainActivity.this, Dashboard.class)),4000);
    }
}