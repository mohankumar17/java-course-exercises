package com.courseprojects;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CircleFileInOut {
    public static void main(String args[]) {
        Scanner sc;
        ArrayList<Circle> radiusList = new ArrayList<>();

        try {
            sc = new Scanner(new File("circle_data.txt"));
            while (sc.hasNext()) {
                double radius = sc.nextDouble();
                radiusList.add(new Circle(radius));
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        ////////////////////

        try {
            PrintWriter pw = new PrintWriter("circle_out_data.txt");
            pw.println("Radius     Area     Circumference");
            for (Circle eachRadiusOb : radiusList) {
                pw.println(eachRadiusOb.getRadius()+"     "+eachRadiusOb.area()+"     "+eachRadiusOb.circumference());
            }
            pw.close();
        } catch (Exception ex) {
            System.out.println("Can not write to the file");
            System.out.println(ex.getMessage());
        }
    }
}
