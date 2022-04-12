package com.courseprojects;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double firstNum=sc.nextDouble();
        double secondNum=sc.nextDouble();
        double thirdNum=sc.nextDouble();

        double avgOfThree = (firstNum+secondNum+thirdNum)/3;

        System.out.println("Average of "+firstNum+","+secondNum+" and "+thirdNum+" is: "+avgOfThree);
    }
}
