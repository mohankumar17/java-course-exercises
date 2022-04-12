package com.courseprojects;

import java.util.Scanner;
public class DivisibleByThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0){
            System.out.println(num+" is divisible by 3");
        }
        else{
            System.out.println(num+" is NOT divisible by 3");
        }
    }
}
