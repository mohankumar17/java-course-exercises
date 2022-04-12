package com.courseprojects;

import java.util.ArrayList;
import java.util.Scanner;
public class SumOfElements {

    public int sumArr(ArrayList<Integer> arr){
        int sum=0;
        for(int ind=0;ind<arr.size();ind++){
            sum+=arr.get(ind);
        }
        return sum;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 5 integers: ");
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }

        SumOfElements ob=new SumOfElements();
        System.out.println(ob.sumArr(arr));
    }
}
