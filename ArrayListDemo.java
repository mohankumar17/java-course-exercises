package com.courseprojects;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter q to quit or press any key to add elements:");
            String userChoice=sc.next();
            if(userChoice.equals("q")){
                break;
            }
            System.out.println("Enter new element: ");
            int newElement=sc.nextInt();
            if(newElement<0){
                System.out.println("Please enter non-negative value");
                continue;
            }
            else{
                arr.add(newElement);
            }
        }
        for(int ind=arr.size()-1;ind>=0;ind--){
            System.out.print(arr.get(ind)+" ");
        }
    }
}
