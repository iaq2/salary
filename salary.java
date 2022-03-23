//Ittehad Qabid Java - Computing A Raise

import java.util.Scanner;
import java.text.NumberFormat;

public class salary {
	public static void main(String[] args) {
		double currentSalary;							// Employee's Current Salary
		double raise = 0;									// Amount of the Raise
		double newSalary;								// New Salary for the Employee
		String rating;									// Performance Rating
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter Your Current Salary: ");
		currentSalary = scan.nextDouble();
		
		System.out.print("Please Enter Your Performance Rating (Excellent, Good, Poor) : ");	// Asks for user input of performance
		rating = scan.next();
		if (rating.toUpperCase().equals("EXCELLENT")) {					// if performance rating EXCELLENT condition
			raise = (currentSalary * 6)/100;
		}else		
			if (rating.toUpperCase().equals("GOOD")) {					// if performance rating GOOD condition
				raise = (currentSalary * 4)/100;
		}else
			if (rating.toUpperCase().equals("POOR")) {					// if performance rating POOR condition
				raise = (currentSalary * 1.5)/100;
				
			} else {
				System.out.print("Invalid Rating, Terminating Program.." );		// Terminates program if user input is not within condition
				System.exit(1);
		}
		
		newSalary = currentSalary + raise;				// The sum of the previous Salary and Raise
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Your Current Salary is: " + money.format(currentSalary));		//Displays Old Salary
		System.out.println("The Amount of Your Raise is : " + money.format(raise));			//Displays the Raise Amount
		System.out.println("Your New Salary Will Be: " + money.format(newSalary));			//Displays the New Salary with Raise 
		System.out.println();
	}
}
