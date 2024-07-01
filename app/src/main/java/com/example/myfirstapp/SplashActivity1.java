package com.example.myfirstapp;

import static com.example.myfirstapp.R.anim.move_line;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity1 extends AppCompatActivity {
   // LottieAnimationView lottie = findViewById(R.raw.loading_anima);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splashactivity1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // For left to right animation:
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               // lottie.setAnimation(R.raw.loading_anima);
                Intent inext= new Intent(getApplicationContext(),Homeactivity.class);
                startActivity(inext);
                finish();
            }
        },2500);

    }


}