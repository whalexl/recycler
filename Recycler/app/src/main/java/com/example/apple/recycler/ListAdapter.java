package com.example.apple.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Apple on 2019/7/9.
 */

public class ListAdapter extends RecyclerView.Adapter {

    private List<Data> mList;
    @NonNull @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                 View root = LayoutInflater.from(viewGroup.getContext()).
                                inflate(R.layout.layout_item_data, viewGroup, false);
              return new DemoViewHolder(root);
         }


    @Override public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((DemoViewHolder) viewHolder).bind(mList.get(position));
        if(position<3) {
            ((DemoViewHolder) viewHolder).Yellow();
        }

    }
    @Override public int getItemCount() {
                return mList.size();
           }

     public void setList (List<Data> list) {
                 mList = list;
            }

}
