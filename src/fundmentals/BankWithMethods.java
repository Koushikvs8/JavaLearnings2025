package fundmentals;

import java.util.Scanner;

public class BankWithMethods {

    static double balance = 5000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
    while(true) {
        do {
            showMenu();
            option = sc.nextInt();
            performOperation(option);
        } while(option != 4);
    }
    }

    static void showMenu() {
        System.out.println("\n===== BANK MENU (METHODS) =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter Option: ");
    }

    static void performOperation(int option) {

        switch(option) {

            case 1: deposit(); break;
            case 2: withdraw(); break;
            case 3: checkBalance(); break;
            case 4: System.out.println("Exiting..."); break;
            default: System.out.println("Invalid Option!");
        }
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Amount Deposited Successfully!");
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        if(amt > balance)
            System.out.println("Insufficient Balance!");
        else {
            balance -= amt;
            System.out.println("Withdrawal Successful!");
        }
    }

    static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

