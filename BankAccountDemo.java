package com.courseprojects;

public class BankAccountDemo {
    public static void main(String args[]){
        BankAccount ob = new BankAccount("Paul",25000);
        System.out.println(ob.getOwner());
        System.out.println(ob.getBalance());
        ob.depositAmount(2000);
        System.out.println(ob.getBalance());
        ob.withdrawAmount(5000);
        System.out.println(ob.getBalance());
        ob.withdrawAmount(38000);
    }
}
