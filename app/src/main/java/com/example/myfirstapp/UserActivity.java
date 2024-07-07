package com.example.myfirstapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserActivity extends AppCompatActivity {
// BUTTON VARIABLE
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btncurr,btnre,bjp,tmc;
TextView point_1,point_2;
//COUNTING VARIABLE
int count=0,flag=0,score_1=0,score_2=0;
//VALUES VARIABLE
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        bjp.setBackgroundResource(R.drawable.shifting);
    }
    // WHEN BUTTON IS CLICKED
    public void click(View view) {
        btncurr=(Button) view;  // CURRENT BUTTON REFERENCE
        flag++;

        //Printing the values
        if(btncurr.getText().toString().equals("")) {
            if (count == 0) {
                tmc.setBackgroundResource(R.drawable.rightshifting);
                bjp.setBackgroundResource(R.drawable.normal);
                btncurr.setText("X");
                count = 1;
            } else {
                bjp.setBackgroundResource(R.drawable.shifting);
                tmc.setBackgroundResource(R.drawable.simple);
                btncurr.setText("O");
                count = 0;
            }
        }
        if(flag>4){
            //getting the values
            value();
            //Checking for winner
            // 1
            if(b1.equals(b2)&&b2.equals(b3)&& !b1.equals("")){
                if (b1.equals("X")) {
                    point_1.setText(bjp_score());
                    user1_color(btn1,btn2,btn3);
                }
                else {
                    point_2.setText(tmc_score());
                    user2_color(btn1,btn2,btn3);
                }
                Toast.makeText(this, b1+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h=new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);

            }
            // 2
            else if(b4.equals(b5)&&b5.equals(b6)&& !b4.equals("")){
                if (b4.equals("X")) {
                    point_1.setText(bjp_score());
                   user1_color(btn4,btn5,btn6);
                }
                else {
                    point_2.setText(tmc_score());
                   user2_color(btn4,btn5,btn6);
                }
                Toast.makeText(this, b4+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h1=new Handler();
                h1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            // 3
            else if(b7.equals(b8)&&b8.equals(b9)&& !b7.equals("")){
                if (b7.equals("X")) {
                    point_1.setText(bjp_score());
                   user1_color(btn7,btn8,btn9);
                }
                else {
                    point_2.setText(tmc_score());
                    user2_color(btn7,btn8,btn9);
                }
                Toast.makeText(this, b7+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h2=new Handler();
                h2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            // 4
            else if(b1.equals(b4)&&b4.equals(b7)&& !b7.equals("")){
                if (b1.equals("X")) {
                    point_1.setText(bjp_score());
                 user1_color(btn7,btn1,btn4);
                }
                else {
                    point_2.setText(tmc_score());
                    user2_color(btn7,btn1,btn4);
                }
                Toast.makeText(this, b4+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h3=new Handler();
                h3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            // 5
            else if(b2.equals(b5)&&b5.equals(b8)&& !b5.equals("")){
                if (b2.equals("X")) {
                    point_1.setText(bjp_score());
                    user1_color(btn2,btn5,btn8);
                }
                     else {
                    point_2.setText(tmc_score());
                     user2_color(btn2,btn5,btn8);
                    }
                    Toast.makeText(this, b5 + " is a Winner", Toast.LENGTH_SHORT).show();
                Handler h4=new Handler();
                h4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            // 6
            else if(b3.equals(b6)&&b6.equals(b9)&& !b6.equals("")){
                if (b3.equals("X")) {
                    point_1.setText(bjp_score());
                   user1_color(btn3,btn6,btn9);
                }
                else {
                    point_2.setText(tmc_score());
                   user2_color(btn3,btn6,btn9);
                }
                Toast.makeText(this, b6+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h5=new Handler();
                h5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            // 7
            else if(b1.equals(b5)&&b5.equals(b9)&& !b5.equals("")){
                if (b1.equals("X")) {
                    point_1.setText(bjp_score());
                user1_color(btn1,btn5,btn9);
                }
                else {
                    point_2.setText(tmc_score());
                        user2_color(btn1,btn5,btn9);
                }
                Toast.makeText(this, b9+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h6=new Handler();
                h6.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            // 8
            else if(b3.equals(b5)&&b5.equals(b7)&& !b7.equals("")){
                if (b3.equals("X")) {
                    point_1.setText(bjp_score());
                    user1_color(btn3,btn5,btn7);
                }
                else {
                        point_2.setText(tmc_score());
                       user2_color(btn3,btn5,btn7);
                }
                Toast.makeText(this, b5+" is a Winner", Toast.LENGTH_SHORT).show();
                Handler h7=new Handler();
                h7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                },1000);
            }
            else if(flag==9){
                restart();
                Toast.makeText(this, "Match is Draw", Toast.LENGTH_SHORT).show();
            }
        }
    }
    //Ids are found
    public void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnre=findViewById(R.id.btnre);
        bjp=findViewById(R.id.btn_bjp);
        tmc=findViewById(R.id.btn_tmc);
        point_1=findViewById(R.id.score_1);
        point_2=findViewById(R.id.score_2);

    }
    //Restart button for illegale restart
    public void firkaro(View view) {
        restart();
    }
    //values are gotten from button
    public void value(){
        b1=btn1.getText().toString();
        b2=btn2.getText().toString();
        b3=btn3.getText().toString();
        b4=btn4.getText().toString();
        b5=btn5.getText().toString();
        b6=btn6.getText().toString();
        b7=btn7.getText().toString();
        b8=btn8.getText().toString();
        b9=btn9.getText().toString();
    }
    //restarting the game
    public void restart(){
        count=0;flag=0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        bjp.setBackgroundResource(R.drawable.shifting);
        tmc.setBackgroundResource(R.drawable.simple);
        btn1.setBackgroundResource(R.drawable.ekdumnormal);
        btn2.setBackgroundResource(R.drawable.ekdumnormal);
        btn3.setBackgroundResource(R.drawable.ekdumnormal);
        btn7.setBackgroundResource(R.drawable.ekdumnormal);
        btn8.setBackgroundResource(R.drawable.ekdumnormal);
        btn9.setBackgroundResource(R.drawable.ekdumnormal);
        btn4.setBackgroundResource(R.drawable.ekdumnormal);
        btn5.setBackgroundResource(R.drawable.ekdumnormal);
        btn6.setBackgroundResource(R.drawable.ekdumnormal);
    }
    public int bjp_score(){
        score_1+=1;
        return score_1;
    }
    public int tmc_score(){
        score_2+=1;
        return score_2;
    }
    public void user1_color(Button btn1,Button btn2, Button btn3){
        btn1.setBackgroundResource(R.drawable.bjp_btn);
        btn2.setBackgroundResource(R.drawable.bjp_btn);
        btn3.setBackgroundResource(R.drawable.bjp_btn);
    }
    public void user2_color(Button btn1,Button btn2, Button btn3){
        btn1.setBackgroundResource(R.drawable.new_btn);
        btn2.setBackgroundResource(R.drawable.new_btn);
        btn3.setBackgroundResource(R.drawable.new_btn);
    }
}
