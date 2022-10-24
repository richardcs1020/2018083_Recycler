package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "Fanny",
            "Ling",
            "Claude",
            "Mecha Dragon",
            "Skylark",
            "Serene Plum"
    };

    private static String [] foodPrice = {
            "2000",
            "5000",
            "10000",
            "2000",
            "5000",
            "10000"
    };

    private static int [] foodImage = {
            R.drawable.fanny,
            R.drawable.ling,
            R.drawable.claude,
            R.drawable.claude,
            R.drawable.fanny,
            R.drawable.ling,

    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Food food = new Food(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
