package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

     Scanner bank=new Scanner(System.in);
     System.out.print("Enter Your name: ");
        String AccountHoldername=bank.nextLine();

        Scanner Number=new Scanner(System.in);
        System.out.print("Enter Your mobile number: ");
        String mobileNumber=bank.nextLine();

        Scanner emailId=new Scanner(System.in);
        System.out.print("Enter Your email ID: ");
        String email=bank.next();




     System.out.println("Account Holder Name is "+AccountHoldername);
     BankAccount bankAccount= new BankAccount();
     bankAccount.setBanlance(0);
     bankAccount.openAccount();
     bankAccount.checkBalance();

     bankAccount.addMoney(1000);
     bankAccount.withdrawMoney(500);
     bankAccount.checkBalance();
     bankAccount.withdrawMoney(2000);



    }
}


