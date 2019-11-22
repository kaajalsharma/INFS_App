package com.example.infs3634_appdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class NewVideoLinks extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter Adapter;
    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_links);

        recyclerView=findViewById(R.id.rv_main);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        LinkAdapter Adapter = new LinkAdapter();

        Adapter.setData(linksDatabase.getAllLinks());
        recyclerView.setAdapter(Adapter);

    }

}
