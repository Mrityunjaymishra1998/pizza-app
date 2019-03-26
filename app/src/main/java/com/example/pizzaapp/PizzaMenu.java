package com.example.pizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PizzaMenu extends AppCompatActivity {
    ListView  lstview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);
         lstview=findViewById(R.id.lstview);

        ArrayList<Category> menu=new ArrayList<Category>();
        menu.add(new Category(1,"Margherita","Veg"));
        menu.add(new Category(2,"Double Cheese Margherita","Veg"));
        menu.add(new Category(3,"Farm House","Veg"));
        menu.add(new Category(4,"Peppy Paneer","Veg"));
        menu.add(new Category(5,"Deluxe Veggie","Veg"));
        menu.add(new Category(6,"5 Pepper","Veg"));
        menu.add(new Category(7,"Veg Extravaganza","Veg"));
        menu.add(new Category(8,"CHEESE N CORN","Veg"));
        menu.add(new Category(9,"PANEER MAKHANI","Veg"));
        menu.add(new Category(10,"VEGGIE PARADISE","Veg"));

        CustomAdapter adapter=new CustomAdapter(PizzaMenu.this,menu);
        lstview.setAdapter(adapter);
    }
}
