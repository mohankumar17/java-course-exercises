package com.courseprojects;

import java.util.Scanner;

public class TicTacToe {

    public void showGrid(String[][] arrGrid){
        for(int i=0;i<3;i++){
            System.out.println("    "+arrGrid[i][0]+"     |     "+arrGrid[i][1]+"     |     "+arrGrid[i][2]);

            if(i!=2){
                System.out.println("------------------------------------");
            }
        }
    }

    public boolean checkDiagonal(String[][] arrGrid,String player,int row,int col){
        if(row==col){
            //diagonal-1 [00,11,22]
            for(int i=0;i<3;i++){
                if(!arrGrid[i][i].equals(player)){
                    return false;
                }
            }
            return true;
        }

        if(row+col==2){
            //diagonal-2 [20,11,02]
            for(int i=0;i<3;i++) {
                for (int j = 0; j < 3; j++) {
                    if (i + j == 2) {
                        if (!arrGrid[i][j].equals(player)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        return false;
    }
    public boolean checkRow(String[][] arrGrid,String player,int row,int col){
        for(int j=0;j<3;j++){
            if(!arrGrid[row][j].equals(player)){
                return false;
            }
        }
        return true;
    }

    public boolean checkCol(String[][] arrGrid,String player,int row,int col){
        for(int i=0;i<3;i++){
            if(!arrGrid[i][col].equals(player)){
                return false;
            }
        }
        return true;
    }

    public boolean checkStatus(String[][] arrGrid,String player,int row,int col){
        if(checkRow(arrGrid,player,row,col)){
            return true;
        }
        if(checkCol(arrGrid,player,row,col)){
            return true;
        }
        if((row+col)%2==0){
            //indicated corner cell and middle cell
            if(checkDiagonal(arrGrid,player,row,col)){
                return true;
            }
        }
        return false;
    }

    public int fillCell(String[][] arrGrid,String player,int count){
        Scanner sc=new Scanner(System.in);
        if(count>9){
            return 1;
        }
        showGrid(arrGrid);
        System.out.println(player+"'s turn");
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(arrGrid[row][col].equals("X") || arrGrid[row][col].equals("O")){
            System.out.println("Cell already filled!! Please try in a different cell");
            return fillCell(arrGrid,player,count);
        }
        else{
            arrGrid[row][col]=player;
            count++;
            boolean st = checkStatus(arrGrid,player,row,col);
            if(st){
                System.out.println(player+" Won");
                showGrid(arrGrid);
                return 1;
            }
        }
        return 0;
    }

    public void startGame(){
        String[][] arrGrid=new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arrGrid[i][j]=" ";
            }
        }
        int isCompleted=0;
        for(int i=0;i<4;i++){
            isCompleted=fillCell(arrGrid,"X",2*i);
            if(isCompleted==1){
                break;
            }
            isCompleted=fillCell(arrGrid,"O",(2*i)+1);
            if(isCompleted==1){
                break;
            }
        }
        if(isCompleted!=1){
            isCompleted=fillCell(arrGrid,"X",9);
        }
    }

    public static void main(String args[]){
        TicTacToe ob = new TicTacToe();
        ob.startGame();
    }

}
