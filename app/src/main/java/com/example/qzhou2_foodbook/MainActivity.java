package com.example.qzhou2_foodbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView foodList;
    Button addButton;
    Button deleteButton;
    Button popupSaveButton;
    Button popupCancelButton;
    FoodAdapter foodAdapter;
    ArrayList<Food> dataList;
    TextView totalCost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodList = findViewById(R.id.food_list);
        addButton = findViewById(R.id.add_button);
        totalCost = findViewById(R.id.textViewTotalCost);
        dataList = new ArrayList<>();
        Food newFood = new Food("name","this is tasty food",30,"2023-07-01","Fridge",20);
        dataList.add(newFood);
        foodAdapter = new FoodAdapter(this,dataList);
        foodList.setAdapter(foodAdapter);

        Intent intent = new Intent(this, Newfood.class);

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 // intent contructor takes 2 parameters, a context and a class
                    startActivity(intent);
//                createPopup();
            }
        });

    }

    public void createPopup() {
        //code from https://www.youtube.com/watch?v=fn5OlqQuOCk
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        final View newFoodView = getLayoutInflater().inflate(R.layout.popup,null);
        dialogBuilder.setView((newFoodView));
        dialogBuilder.create();
        dialogBuilder.show();
    }

    public void createNewFood(View view) {
//        String name = cityName.getText().toString();
//        dataList.add(newFood);
//        foodAdapter.notifyDataSetChanged();
//        totalCost.setText(dataList.size());
    }


}