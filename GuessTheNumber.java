package com.courseprojects;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GuessTheNumber {
    public static void main(String args[]){
        Random randOb=new Random();
        int randNum=randOb.nextInt(100)+1;
        System.out.println(randNum);
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(true){
            System.out.println("Press Q to quit the game or any key to resume the game: ");
            String c=sc.next();
            if(c.equals("Q")){
                break;
            }
            System.out.println("Guess the number: ");
            int guessNum=sc.nextInt();
            if(randNum==guessNum){
                System.out.println("Congratulations!! You have guesses the number in "+count+" guesses! Thanks for playing!");
                break;
            }
            else if(guessNum>=1 && guessNum<=100){
                if(guessNum>randNum){
                    System.out.println("Your guess was too high");
                }
                else {
                    System.out.println("Your guess was too low");
                }
            }
            else{
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
            }
            count++;
        }
    }
}
