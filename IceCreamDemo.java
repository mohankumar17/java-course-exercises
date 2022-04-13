package com.courseprojects;

public class IceCreamDemo {
    public static void main(String args[]){
        IceCream ob=new IceCream("Vanilla",175,3);
        System.out.println(ob.getName());
        System.out.println(ob.getCost());
        System.out.println(ob.getNumScoops());

        ob.addToppings("Almonds");
        ob.addToppings("Chocolate");
        ob.printToppings();
    }
}
