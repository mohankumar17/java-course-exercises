package com.courseprojects;

import java.util.Scanner;
public class ArrayDemo {
    public static void main(String args[]){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array after doubling each element: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]*2+" ");
        }
    }
}
