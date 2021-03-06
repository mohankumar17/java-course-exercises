package com.courseprojects;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
}
