package com.courseprojects;

import java.util.ArrayList;
import java.util.Scanner;
public class NamePermutations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> firstNameArr = new ArrayList<>();
        ArrayList<String> lastNameArr = new ArrayList<>();

        StringBuilder fullName;

        for(int i=0;i<5;i++){
            System.out.println("Enter full name: ");
            fullName=new StringBuilder(sc.nextLine());
            int spaceInd=fullName.indexOf(" ");
            String firstName=fullName.substring(0,spaceInd);
            String lastName=fullName.substring(spaceInd+1,fullName.length());
            firstNameArr.add(firstName);
            lastNameArr.add(lastName);
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(firstNameArr.get(i)+" "+lastNameArr.get(j));
            }
        }

    }
}
