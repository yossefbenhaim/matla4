package com.company;

import java.util.HashMap;
import java.util.Set;

public class Restaurant {
    public String resName;
    HashMap<Ingredient, Double> ingreidients;

    public Restaurant(String resName) {
        this.resName = resName;
        ingreidients = new HashMap<Ingredient, Double>();
    }

    public void addIngredient(Ingredient i, double amount) {
        ingreidients.put(i, amount);

    }

    public Double totalCost() {

        final double[] sumPrice = {0};
        ingreidients.forEach((k, v) -> {
            sumPrice[0] += k.getIngPrice() * v;
        });
        return sumPrice[0];
    }

    public Boolean isAvailable(Dish dish) {
        final boolean[] flag = {true};

        Set<String> listOfDish = dish.getIngredients().keySet();
        Set<Ingredient> listOfIng = ingreidients.keySet();

        HashMap<String, Boolean> doesContain = new HashMap<>();

        for (String IngName : listOfDish) {
            doesContain.put(IngName, false);
            for (Ingredient i : listOfIng) {
                if (i.getIngName().equals(IngName)){
                    doesContain.replace(IngName, true);
                }
            }
        }
        if (doesContain.containsValue(false)) return false;

        ingreidients.forEach((k, v) -> {
            if (dish.getIngredients().containsKey(k.getIngName())) {
                if (dish.getIngredients().get(k.getIngName()) > v) {
                    flag[0] = false;
                }
            }

        });

        return flag[0];
    }
}

