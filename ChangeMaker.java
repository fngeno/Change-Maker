package labprojectsWeek2;

import java.util.Scanner;

public class ChangeMaker { // This program display change breakdown of coins in US currency the user
							// enters.

	public static void main(String[] args) {

		changeDue(); // calling of the method on the main.

	}

	public static void changeDue() { // Beginning of the method
		Scanner scanner = new Scanner(System.in); // create to allow user to input the coins

		System.out.println("Enter US coins from (0-99) cents: "); // Prompt the user to the amount between 0-99 cents
		int change = scanner.nextInt();

		int numberOfQuaters = (int) (change / 25);
		change = change % 25;// Dividing by 25 to get quarters and casting in to integer to obtain the
								// remaining change.

		int numberOfDimes = (int) (change / 10); // Dividing by 10 to find the dimes
		change = change % 10; // Division operator yields integer part, remainder operator obtains remainder
								// of division

		int numberOfNickles = (int) (change / 5);
		change = change % 5; // divide by 5 to find the number of nickels

		int numberOfpennies = (int) (change); // Remaining coins will be pennies

		// Display below using If statements to allow only the coins to display on the
		// change.

		if (numberOfQuaters != 0) {
			System.out.println("Number of quaters given: " + numberOfQuaters + " quaters");
		}
		if (numberOfDimes != 0) {
			System.out.println("Number of dimes given: " + numberOfDimes + " dimes");
		}
		if (numberOfNickles != 0) {
			System.out.println("Number of nickles given: " + numberOfNickles + " nickles");
		}

		if (numberOfpennies != 0) {
			System.out.println("Number of pennies given: " + numberOfpennies + " pennies");

			scanner.close(); // closing the scanner

		}

	}

}
