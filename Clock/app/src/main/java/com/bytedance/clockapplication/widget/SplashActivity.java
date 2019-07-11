package com.bytedance.clockapplication.widget;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;

/**
 * description :
 * author      : liang.tong
 * create on   : 2019/7/9
 */

public class SplashActivity {

    private TextView mSkipView;
    private Handler mHandler = new Handler();

    public void delayJump() {
        mHandler.postDelayed(new Runnable() {
            @Override public void run() {
                goMainActivity();
            }
        }, 5000);

        mSkipView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                mHandler.removeCallbacksAndMessages(null);
                goMainActivity();
            }
        });
    }

    private void goMainActivity() {

    }
}
