package com.example.month3_lesson4_homework;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClick {
    private RecyclerView recyclerView;
    private ArrayList<String>fruitAndVegetables=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);




        fruitAndVegetables = new ArrayList<>();
        fruitAndVegetables.add("Apple");
        fruitAndVegetables.add("Carrot");
        fruitAndVegetables.add("Melon");
        fruitAndVegetables.add("Watermelon");
        fruitAndVegetables.add("Avocado");
        fruitAndVegetables.add("Mango");
        fruitAndVegetables.add("Grape");
        fruitAndVegetables.add("Papaya ");
        fruitAndVegetables.add("Coconut");
        fruitAndVegetables.add("Orange");
        fruitAndVegetables.add("Pear");
        fruitAndVegetables.add("Plum");
        fruitAndVegetables.add("Apricot");
        fruitAndVegetables.add("Tomato");
        fruitAndVegetables.add("Potato");
        fruitAndVegetables.add("Onion");
        fruitAndVegetables.add("Cucumber");
        fruitAndVegetables.add("Cabbage");
        fruitAndVegetables.add("Capsicum");
        fruitAndVegetables.add("Broccoli");
        fruitAndVegetables.add("Dragon Fruit");
        fruitAndVegetables.add("Corn");
        fruitAndVegetables.add("Green Bean");
        fruitAndVegetables.add("Spinach");
        fruitAndVegetables.add("Beetroot");
        fruitAndVegetables.add("Radish");
        fruitAndVegetables.add("Peas");
        fruitAndVegetables.add("Garlic");
        fruitAndVegetables.add("Red pepper");
        FruitAndVegetablesAdapter adapter = new FruitAndVegetablesAdapter();
        adapter.setFruitVegetables(fruitAndVegetables, this);
        recyclerView.setAdapter(adapter);


    }


    @Override
    public void itemClickListener(String name) {
        TextView fruit = findViewById(R.id.fruit);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Result", fruit.getText().toString());
        startActivity(intent);
    }
}
