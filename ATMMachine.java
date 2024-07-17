//package ATMMachine;

import java.util.*;

import java.util.Scanner;

class ATM{

    Float Balance;
    int PIN = 2938;

   public void checkpin(){
    System.out.println("Enter ypur pin:");
     Scanner sc = new Scanner(System.in);
     int enteredpin = sc.nextInt();
     if (enteredpin == PIN) {
        menu();
        
     }
     else{
        System.out.println("enter a valid pin");
        menu();
     }


   }
   public void menu(){

    System.out.println("Enter your choise:");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. Withdral money");
    System.out.println("3. Deposit Money");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if (opt ==1) {
        CheckBalance();
        
    }
    else if(opt == 2){
        WithdrawMoney();

    }
    else if(opt == 3){
        depositMoney();

    }
    else if(opt == 4){
        return;
    }
    else{
        System.out.println("Enter a Valid Choise");
    }

   }

   public void CheckBalance(){
    System.out.println("Balance :" + Balance);
    menu();
   }
   public void WithdrawMoney(){
    System.out.println("Enter Amount to withdraw: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount>Balance){
        System.out.println("Insufficient Balance");
    }
    else{
        Balance = Balance - amount;
        System.out.println("Money withdrawl Successful");

    }
    menu();
   }
   public void depositMoney(){
    System.out.println("Enter your amount: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance + amount;
    System.out.println("Monry deposited Successfully");
    menu();
   }
}



public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}
