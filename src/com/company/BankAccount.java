package com.company;
import java.util.Scanner;
public class BankAccount {
   public String accountHolderName;
   private int balance;
   private String emailId;
   public String mobileNumber;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBanlance() {
        return balance;
    }

    public void setBanlance(int banlance) {
        this.balance = banlance;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void openAccount(){
        // do Account opening activities: do customer verification, save in data Base
        System.out.println("Account opened for "+accountHolderName);
    }
    public void checkBalance(){
        System.out.println("Account balance is "+balance);
    }
    public void addMoney(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + "rupees added to your account, " +
                    "updated balance" + balance);
        } else {
            System.out.println("Can't add money");
        }
    }
        public void withdrawMoney(int amount){
            if(balance>amount){
                balance= balance-amount;
                System.out.println(amount+"rupees withdrawn from account ");
            }else{
                System.out.println("insufficent Balance");
            }
    }
}

