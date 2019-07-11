package com.example.apple.animation;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Animation loadAnimation;
    public  ImageView mImage;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = findViewById(R.id.image);
        loadAnimation = AnimationUtils.loadAnimation(this, R.xml.animation);
        mImage.startAnimation(loadAnimation);
        btn1=findViewById(R.id.btn_1);
        btn1.setOnClickListener(this);
        //startActivity(new Intent(this, PropertyActivity.class));
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, LottieActivity.class));
    }
}
