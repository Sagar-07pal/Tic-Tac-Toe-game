package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Homeactivity extends AppCompatActivity {
    Button user,ai;
    Intent user_mode =new Intent(getApplicationContext(), UserActivity.class);
    Intent ai_mode = new Intent(getApplicationContext(),Aiactivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homeactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        user=findViewById(R.id.btn_user);
        ai=findViewById(R.id.btn_ai);
    }
    public void with_ai(){
        user.setBackgroundResource(R.drawable.custom_btn);
        startActivity(ai_mode);
    }
    public void with_user(){
        ai.setBackgroundResource(R.drawable.custom_btn);
        startActivity(user_mode);
    }
}