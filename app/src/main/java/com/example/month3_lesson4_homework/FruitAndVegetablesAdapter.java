package com.example.month3_lesson4_homework;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FruitAndVegetablesAdapter extends RecyclerView.Adapter<FruitAndVegetablesViewHolder> {
    public void setFruitVegetables(ArrayList<String> fruitVegetables, itemClick itemClick) {
        this.fruitVegetables = fruitVegetables;
        this.itemClick = itemClick;
    }

    private ArrayList<String> fruitVegetables;
    private itemClick itemClick;

    @NonNull
    @Override
    public FruitAndVegetablesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FruitAndVegetablesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_vegetables,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAndVegetablesViewHolder holder, int position) {
        holder.bind(fruitVegetables.get(position));
        holder.itemContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                itemClick.itemClickListener(fruitVegetables.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return fruitVegetables.size();
    }


}