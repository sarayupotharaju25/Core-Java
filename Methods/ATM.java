package Methods;

import java.util.Scanner;

public class ATM {
	
	static double balance=20000;
	static void displaymenu() {
		System.out.println("1. CheckBalance :");
		System.out.println("2. Deposit Amount :");
		System.out.println("3. Withdraw amount :");
		System.out.println("4. Exit :");

	}

	

	void cb() {
		System.out.println("Balance :" + balance);
	}

	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("rupees : " + amount + " " + "Deposited successfully!");
		System.out.println("Available balance: " + balance);
	}

	void withdraw(double wa) {
		balance = balance - wa;
		System.out.println("rupees : " + wa + " " + "Withdraw Successful");
		System.out.println("Available balance:" + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			displaymenu();
            System.out.println("Enter choice: ");
			choice=sc.nextInt();
			switch (choice) {
			case 1:

				ATM p1 = new ATM();
				p1.cb();
				break;
			case 2:
				ATM p2 = new ATM();
				System.out.println("Enter deposit amount: ");
				double amount = sc.nextDouble();
				p2.deposit(amount);
				break;
			case 3:
				ATM p3 = new ATM();
				System.out.println("Enter withdraw amount: ");
				double wa = sc.nextDouble();
				p3.withdraw(wa);
				break;
			default:
				System.out.println("Exit due to invalid choi");
			}
			
		} 
		while(choice!=4);
	}}

