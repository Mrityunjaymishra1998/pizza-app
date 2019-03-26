package com.example.pizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Sneakpeek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneakpeek);
        ArrayList<Video> video= new ArrayList<Video>();
        video.add(new Video("Margherita","Veg"));
        video.add(new Video("Double Cheese Margherita","Veg"));
        video.add(new Video("Farm House","Veg"));
        video.add(new Video("Peppy Paneer","Veg"));
        video.add(new Video("Deluxe Veggie","Veg"));
        video.add(new Video("5 Pepper","Veg"));
        video.add(new Video("Veg Extravaganza","Veg"));
        video.add(new Video("CHEESE N CORN","Veg"));
        video.add(new Video("PANEER MAKHANI","Veg"));
        video.add(new Video("VEGGIE PARADISE","Veg"));

    }
}
