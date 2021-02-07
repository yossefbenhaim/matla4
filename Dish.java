package com.company;

import java.util.HashMap;

public class Dish {
    private String dishID;
    private String dishName;
    private HashMap<String, Double> ingredients;
    private int dishPrice;

    public Dish(String dishID, String dishName, int dishPrice) {

        this.dishID = dishID;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        ingredients = new HashMap<String, Double>();
    }

    public HashMap<String, Double> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDishID() {
        return dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishID(String d) {
        this.dishID = d;
    }

    public void setDishName(String n) {
        this.dishName = n;
    }

    public void setDishPrice(int p) {
        this.dishPrice = p;
    }




}