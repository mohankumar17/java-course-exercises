package com.courseprojects;

import java.util.Scanner;
public class MadLibsClone {
    public static void main(String[] args){
        String adjective1,girls_name,adjective_2,occupation1,place,
                clothing,hobby,adjective3,occupation2,boys_name,mans_name;
        Scanner sc = new Scanner(System.in);

        adjective1=sc.nextLine();
        girls_name=sc.nextLine();
        adjective_2=sc.nextLine();
        occupation1=sc.nextLine();
        place=sc.nextLine();
        clothing=sc.nextLine();
        hobby=sc.nextLine();
        adjective3=sc.nextLine();
        occupation2=sc.nextLine();
        boys_name=sc.nextLine();
        mans_name=sc.nextLine();

        String content="There once was a "+adjective1+" girl named "+girls_name+", who was a " +
                adjective_2+" "+occupation1+" in the Kingdom of "+place+". She loved to wear "+clothing+
                " and to "+hobby+". She wanted to marry the "+adjective3+" "+occupation2+" named "+boys_name+
                " but her father, King "+mans_name+" forbid her from seeing him.";

        System.out.println(content);
    }
}
