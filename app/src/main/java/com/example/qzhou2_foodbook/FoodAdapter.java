package com.example.qzhou2_foodbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
// knowledge from https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView

public class FoodAdapter extends ArrayAdapter<Food>
    {
    public FoodAdapter(Context context, ArrayList<Food> Foods) {
        super(context, R.layout.list_item, Foods);
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            Food food = (Food) getItem(position);
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }
            // Lookup view for data population
            TextView foodName = (TextView) convertView.findViewById(R.id.textViewItemName);
            TextView foodDescription = (TextView) convertView.findViewById(R.id.description);
            TextView foodCount = (TextView) convertView.findViewById(R.id.count);
            TextView foodUnitCost = (TextView) convertView.findViewById(R.id.unitCost);

            // Populate the data into the template view using the data object
            foodName.setText(food.getName());
            foodDescription.setText(food.getDescription());
            foodCount.setText(String.valueOf(food.getCount()));
            foodUnitCost.setText(String.valueOf(food.getUnitCount()));
            // Return the completed view to render on screen
            return convertView;
    }}
