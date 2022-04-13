package com.courseprojects;

public class Circle {
    private double radius;
    public Circle(){
        this.radius=1;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public double circumference(){
        return 2*3.14*this.radius;
    }
    public double area(){
        return 3.14*Math.pow(this.radius,2);
    }
}
