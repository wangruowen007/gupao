package com.gupaoedu.homework.template;

public class DrinkTemplate {

    public Drink makeDrink(){
        //加原料
        Drink material = addMaterial();

        //加水
        addWater();

        return material;
    }

    private void addWater() {
        System.out.println("加水");
    }

    public Drink addMaterial(){
        return null;
    }
}
