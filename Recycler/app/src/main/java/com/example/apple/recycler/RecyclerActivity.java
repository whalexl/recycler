package com.example.apple.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
     private RecyclerView mListView;
     private ListAdapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        mListView = findViewById(R.id.rl_list);
        mListView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ListAdapter();
        mListView.setAdapter(mAdapter);
        mAdapter.setList(DataFactory.getData(15));
      //  mAdapter.notifyDataSetChanged();

    }
}
