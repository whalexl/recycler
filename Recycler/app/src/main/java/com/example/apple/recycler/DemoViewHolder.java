package com.example.apple.recycler;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Apple on 2019/7/9.
 */

public class DemoViewHolder extends RecyclerView.ViewHolder {
    TextView mTextViewNum;
    TextView mTextViewData;
    TextView mTextViewCount;
    public DemoViewHolder(View itemView) {
        super(itemView);
        mTextViewNum = itemView.findViewById(R.id.tv_no);
        mTextViewData= itemView.findViewById(R.id.tv_news);
        mTextViewCount = itemView.findViewById(R.id.tv_num);
    }

    public void bind(Data data) {
        mTextViewNum.setText(data.getInfo());
        mTextViewData.setText(data.getData());
        mTextViewCount.setText(data.getCount());
    }
    public void Yellow(){
        mTextViewNum.setTextColor(Color.parseColor("#e6face15"));
    }
}
