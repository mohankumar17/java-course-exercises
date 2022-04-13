package com.courseprojects;

public class BankAccount {
    private int balanceAmount;
    private final String ownerName;
    public BankAccount(String ownerName){
        this.ownerName=ownerName;
        this.balanceAmount=0;
    }
    public BankAccount(String ownerName,int balanceAmount){
        this.ownerName=ownerName;
        if(balanceAmount>0){
            this.balanceAmount=balanceAmount;
        }
    }
    public void depositAmount(int newAmount){
        if(newAmount>0){
            this.balanceAmount+=newAmount;
        }
        else{
            System.out.println("Deposit amount must be greater than 0");
        }
    }
    public void withdrawAmount(int requiredAmount){
        if(requiredAmount>0){
            this.balanceAmount-=requiredAmount;
        }
        else{
            System.out.println("Required amount must be greater than 0");
        }
        if(requiredAmount>this.balanceAmount){
            System.out.println("Insufficient Balance");
        }
    }
    public int getBalance(){
        return this.balanceAmount;
    }
    public String getOwner(){
        return this.ownerName;
    }
}
