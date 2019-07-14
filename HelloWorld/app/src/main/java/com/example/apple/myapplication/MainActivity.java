package com.example.apple.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2=findViewById(R.id.button2);
        final TextView tv1=findViewById(R.id.textView1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,memo.class));
                Log.d("bt","date");
            }
        });
        Button button1=findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,time.class));
                Log.d("bt","time");
            }
        });
        Button button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("developing!");
                Log.d("bt","more");
            }
        });
        final ImageView ima = findViewById(R.id.imageView7) ;

        Switch open = findViewById(R.id.switch1);
            open.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton,
                                             boolean isChecked) {
                    if (isChecked) {
                        ima.setPivotX(ima.getWidth()/2);
                        ima.setPivotY(ima.getHeight()/2);//支点在图片中心
                        ima.setRotation(180);
                        Log.d("sw","rotate");
                    } else {
                       ima.setPivotX(ima.getWidth()/2);
                        ima.setPivotY(ima.getHeight()/2);//支点在图片中心
                       ima.setRotation(360);
                        Log.d("sw","restore");
                    }
                }
            });
    }

}
