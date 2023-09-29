package project;

import java.util.Scanner;

import entities.Account;
import model.exceptions.Exceptions;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Initial balance: ");
		double iBalance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		double limit = sc.nextDouble();

		Account acc = new Account(number, name, iBalance, limit);

		System.out.print("Enter amount for withdraw: ");
		double withdrawAmount = sc.nextDouble();
		try {
			acc.limit(withdrawAmount);
			acc.withdraw(withdrawAmount);
			System.out.println("New balance: " + acc.getBalance());
			sc.close();

		} catch (Exceptions e) {
			System.out.println("Error: " + e.getMessage());

		}

	}

}
