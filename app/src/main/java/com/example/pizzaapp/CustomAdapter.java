package com.example.pizzaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class CustomAdapter extends ArrayAdapter<Category> {
    public CustomAdapter(Context context, ArrayList<Category> menu) {
        super(context,0, menu);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Category cat=getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.pizza_layout,parent,false);
        TextView txtid= view.findViewById(R.id.txt_id);
        TextView txtname=view.findViewById(R.id.txt_name);
        TextView txttype=view.findViewById(R.id.txt_type);
        txtid.setText(cat.getId()+" ");
        txtname.setText(cat.getName());
        txttype.setText(cat.getType());

        ImageView imgview=view.findViewById(R.id.imgview);

        switch (cat.getName())
        {
            case "Margherita":
            {
                imgview.setImageResource(R.drawable.margherit);
                break;
            }
            case "Double Cheese Margherita":
            {
                imgview.setImageResource(R.drawable.doublecheese);
                break;
            }
            case "Farm House":
            {
                imgview.setImageResource(R.drawable.farmhouse);
                break;
            }
            case "Peppy Paneer":
            {
                imgview.setImageResource(R.drawable.peepypanner);
                break;
            }
            case "Deluxe Veggie":
            {
                imgview.setImageResource(R.drawable.deluxeveggie);
                break;
            }
            case "5 Pepper":
            {
                imgview.setImageResource(R.drawable.peeper);
                break;
            }
            case "Veg Extravaganza":
            {
                imgview.setImageResource(R.drawable.extraveg);
                break;
            }
            case "CHEESE N CORN":
            {
                imgview.setImageResource(R.drawable.corncheese);
                break;
            }
            case "PANEER MAKHANI":
            {
                imgview.setImageResource(R.drawable.peepypanner);
                break;
            }
            case "VEGGIE PARADISE":
            {
                imgview.setImageResource(R.drawable.corncheese);
                break;
            }

        }


        return view;


    }
}
