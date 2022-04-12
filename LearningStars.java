package com.courseprojects;

import java.util.Scanner;
public class LearningStars {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Learning Package Number: ");
        int packageNo = sc.nextInt();
        System.out.println("Enter the total courses enrolled: ");
        int totCourses = sc.nextInt();

        int totCost=0;

        if(packageNo==1){
            totCost=10+(totCourses-2)*6;
        }
        else if(packageNo==2){
            totCost=12+(totCourses-4)*4;
        }
        else if(packageNo==3){
            totCost=15+(totCourses-6)*3;
        }
        else{
            System.out.println("Invalid Learning Package");
        }
        System.out.println("Total Learning Cost: $"+totCost);
    }
}
