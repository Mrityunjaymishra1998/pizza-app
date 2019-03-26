package com.example.pizzaapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {
    WebView videoweb;

    List<Video2> video2List;
    public VideoAdapter() {
    }
    public VideoAdapter(List<Video2> video2List) {
        this.video2List = video2List;
    }

    @NonNull
    @Override
     public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.videoview,parent,false);

        return new VideoViewHolder(view);

    }

    @Override
    public void onBindViewHolder( VideoViewHolder viewHolder, int i) {
        viewHolder.videoweb.loadData(video2List.get(i).getUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return video2List.size();

    }

    public class  VideoViewHolder extends RecyclerView.ViewHolder {
        WebView videoweb;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoweb = (WebView) itemView.findViewById(R.id.webView);
            videoweb.getSettings().setJavaScriptEnabled(true);
            videoweb.setWebChromeClient(new WebChromeClient() {
            });
        }
    }



}
