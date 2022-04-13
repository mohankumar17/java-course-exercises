package com.courseprojects;

public class CircleDemo {
    public static void main(String args[]){
        Circle ob=new Circle(3);
        System.out.println("Radius: "+ob.getRadius());
        System.out.println("Circumference: "+ob.circumference());
        System.out.println("Area: "+ob.area());
        ob.setRadius(2);
        System.out.println("Circumference: "+ob.circumference());
        System.out.println("Area: "+ob.area());
    }
}
