package com.example.month3_lesson4_homework;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FruitAndVegetablesViewHolder extends RecyclerView.ViewHolder {
     TextView fruit;
     LinearLayout itemContainer;

    public FruitAndVegetablesViewHolder(@NonNull View itemView) {
        super(itemView);
        fruit = itemView.findViewById(R.id.fruit);
        itemContainer = itemView.findViewById(R.id.name_container);
    }

    public void bind(String fruitAndVegetables) {
        fruit.setText(fruitAndVegetables);
    }



}