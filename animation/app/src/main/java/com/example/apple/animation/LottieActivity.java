package com.example.apple.animation;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.airbnb.lottie.LottieAnimationView;

import static java.lang.Boolean.TRUE;

public class LottieActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    SeekBar sk1;
    LottieAnimationView lt1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        sk1=findViewById(R.id.sk_1);
        sk1.setOnSeekBarChangeListener(this);
        lt1=findViewById(R.id.animation_view);
        btn1=findViewById(R.id.btn_2);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        lt1.setProgress((float) i/100f);

        //lt1.playAnimation();
           Log.d("on", String.valueOf(i));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
    public void onClick(View view) {
        startActivity(new Intent(this, ViewpaperActivity.class));
    }

}
