package com.courseprojects;

import java.util.ArrayList;
import java.util.Scanner;

public class ParallelArraysDemo {
    public static void main(String args[]) {
        ArrayList<String> nameArr = new ArrayList<>();
        ArrayList<Integer> ageArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String personName=sc.next();
            int personAge=sc.nextInt();
            nameArr.add(personName);
            ageArr.add(personAge);
        }
        for(int i=0;i<5;i++){
            System.out.println(nameArr.get(i)+" is "+ageArr.get(i)+" years old.");
        }
    }
}
