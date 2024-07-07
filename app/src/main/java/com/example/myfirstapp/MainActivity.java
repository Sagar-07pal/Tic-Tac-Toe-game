package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button user,ai;
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

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ai.setBackgroundResource(R.drawable.custom_btn);
                Intent mainIntent = new Intent(MainActivity.this,UserActivity.class);
                startActivity(mainIntent);
            }
        });
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setBackgroundResource(R.drawable.custom_btn);
                Intent mainIntent = new Intent(MainActivity.this,AiActivity.class);
                startActivity(mainIntent);
            }
        });
    }
    public void with_ai(){

    }
    public void with_user(){

    }
}