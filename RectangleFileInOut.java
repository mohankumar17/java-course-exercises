package com.courseprojects;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class RectangleFileInOut {
    public static void main(String args[]){
        Scanner sc;
        ArrayList<Rectangle> dimList=new ArrayList<>();;
        try{
            sc=new Scanner(new File("rectangle_data.txt"));
            while(sc.hasNext()){
                String dim=sc.nextLine();
                int ind=dim.indexOf(" ");
                double length= Double.parseDouble(dim.substring(0,ind));
                double width= Double.parseDouble(dim.substring(ind+1,dim.length()));
                dimList.add(new Rectangle(length,width));
            }
            sc.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        for(Rectangle eachOb:dimList){
            System.out.println("Length: "+eachOb.getLength());
            System.out.println("Width: "+eachOb.getWidth());
            System.out.println("Perimeter: "+eachOb.getPerimeter());
            System.out.println("Area: "+eachOb.getArea());
        }
    }
}
