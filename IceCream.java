package com.courseprojects;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;
    public IceCream(String name, int cost, int numScoops){
        this.name=name;
        this.cost=cost;
        this.numScoops=numScoops;
        this.toppings=new ArrayList<>();
    }
    public void addToppings(String topping){
        this.toppings.add(topping);
    }
    public void printToppings(){
        for(String eachTopping:this.toppings){
            System.out.print(eachTopping+" ");
        }
        System.out.println();
    }
    public int getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }
    public int getNumScoops(){
        return this.numScoops;
    }
}
