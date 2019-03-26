package com.example.pizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.Vector;

public class Sneakpeek2 extends AppCompatActivity {
    RecyclerView Res_view;
    Vector<Video2>video2s=new Vector<Video2>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneakpeek2);
        Res_view = (RecyclerView) findViewById(R.id.Res_view);
        Res_view.setHasFixedSize(true);
        Res_view.setLayoutManager(new LinearLayoutManager(this));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));
        video2s.add(new Video2("https://www.youtube.com/watch?v=mx_wfjmvTzw"));

        VideoAdapter videoAdapter=new VideoAdapter(video2s);
        Res_view.setAdapter(videoAdapter);
    }
}