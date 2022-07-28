import java.util.Objects;
import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Banking Application System");
        System.out.println("Please enter you account information to verify you bank account");
        System.out.println("Enter account ID number");
        String accountid = scanner.next();
        System.out.println("Enter account holder name");
        String accountholder = scanner.next();
        System.out.println("Enter account balance");
        int accountbalance = scanner.nextInt();
        BankAccount obj1 = new BankAccount(accountid, accountholder, accountbalance);
        obj1.menu();
    }
}
// make another change for master branch
// make one more change for feature
class BankAccount{
    int balance;
    String customerName;
    String customerId;
    BankAccount(String id, String name, int bal){
        customerName = name;
        customerId = id;
        balance = bal;

    }

    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
        }
    }

    void menu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Banking Application System");
        System.out.println("Please Select the following features you need");
        System.out.println("A. Display All Account Details");
        System.out.println("B. Search By Account Number");
        System.out.println("C. Deposit");
        System.out.println("D. Withdraw");
        System.out.println("E. Exit");
        do{
            System.out.println("Enter your selection");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            switch(option){
                case 'A':
                    System.out.println("Account ID : " + customerId);
                    System.out.println("Account Holder : " + customerName);
                    System.out.println("Account Balance : " + balance);
                    break;
                case 'B':
                    System.out.println("Enter the account id");
                    String temp_id2 = scanner.next();
                    if(temp_id2.equals(customerId)){
                        System.out.println("Account ID : " + customerId);
                        System.out.println("Account Holder : " + customerName);
                        System.out.println("Account Balance : " + balance);
                    }else{
                        System.out.println("Wrong Account Id");
                    }
                    break;
                case 'C':
                    System.out.println("Enter the amount");
                    int temp_amount1 = scanner.nextInt();
                    deposit(temp_amount1);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("Enter the amount");
                    int temp_amount2 = scanner.nextInt();
                    withdraw(temp_amount2);
                    System.out.println("\n");
                    break;
            }
        }while(option != 'E');

        System.out.println("Thank you for using the service");
    }
}
