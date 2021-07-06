package com.homerianreyes.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Crypto> mCrptoData;
    private RecyclerView mRecyclerView;
    private CyrptoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCrptoData = new ArrayList<>();

        //initialize recyclerview
        mRecyclerView = findViewById(R.id.recyclerview);
        //initialize the adapter
        mAdapter = new CyrptoAdapter(this, mCrptoData);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initialize the data
        String[] cryptoName = getResources().getStringArray(R.array.list_titles);
        String[]cryptoInfo = getResources().getStringArray(R.array.list_infos);

        for (int i = 0; i < cryptoInfo.length; i++ ) {
            mCrptoData.add(new Crypto(cryptoName[i], cryptoInfo[i]));
        }
    }
}