package savingsCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Given inputs, calculates the total amount the user must save for retirement and how much
		//the user must save per month
		//
		//Parameters: n/a
		//Returns: n/a 
		
		//user_input: Scanner that takes input from user
		Scanner user_input = new Scanner(System.in);
		
		//Prompts user how many years they intend to work and stores under work_years as integer
		System.out.println("How many years do you intend to work?");
		int work_years = user_input.nextInt();
		
		//Prompts user what their average return on investment is and stores it under avg_return_invest
		//as a double
		System.out.println("What is your average expected return on investment? (0-20%)");
		double avg_return_invest = (user_input.nextDouble())/100;
		
		//If rate is below 0 or over 20, program will prompt user to reenter a value
		while (avg_return_invest < 0 || avg_return_invest > .2) {
			System.out.println("The rate must be between 0 and 20. Please reenter a value:");
			avg_return_invest = (user_input.nextDouble())/100;
		}
		
		//Prompts user what their average return on payback is and stores it under avg_return_payback
		//as a double
		System.out.println("What is your average expected return on paypack? (0-3%)");
		double avg_return_payback = (user_input.nextDouble())/100;
		//If rate is below 0% or over 3%, program will prompt user to reenter a value
		while ((avg_return_payback < (0)) || (avg_return_payback > .03)) {
			System.out.println("The rate must be between 0 and 3. Please reenter a value:");
			avg_return_payback = (user_input.nextDouble())/100;
		}
		
		//Prompts user how many years they intend to draw from SSI and stores under draw_years as integer
		System.out.println("How long do you intend to draw from Social Security?");
		int draw_years = user_input.nextInt();
		
		//Prompts user what their required income is per month in retirement and stores under req_income
		//as a double 
		System.out.println("What is your required income?");
		double req_incm = (user_input.nextDouble());
		
		//Prompts user what their expected SSI income is and stores under SSI_incm as double
		System.out.println("What is your expected Social Security income?");
		double SSI_incm = user_input.nextDouble();
		//If amount is over the max SSI income, program will prompt user to reenter a value at
		//or below the max SSI income
		while (SSI_incm > 2642.00) {
			System.out.println("Value cannot exceed max Social Security payout. Please re-enter a value: ");
			SSI_incm = user_input.nextDouble();
		}
		
		user_input.close();
		//Calculation for difference between the required monthly income and SSI income in
		//retirement; stored under total_savings as double
		double total_savings = (req_incm - SSI_incm);
		
		//Calculation for total savings in retirement, using formula for present value; stores
		//variable under savings_retirement, a double
		double savings_retirement = total_savings * (1 - (1/(Math.pow((1+avg_return_payback/12), draw_years*12))))/(avg_return_payback/12); 
		
		//Calculation of the compound rate used in the formula for future value; stores value under 
		//interest_multiplier as a double
		double interest_multiplier = (Math.pow(1 + (avg_return_invest/12), work_years*12) - 1) / (avg_return_invest/12);
		
		//Calculation of monthly savings rate; stored under monthly_rate as a double
		double monthly_rate = savings_retirement/interest_multiplier;
		
		//Prints total savings needed in retirement as dollar value
		System.out.printf("You will need to save a total of $%.2f.\n", savings_retirement);
		
		//Prints monthly savings needed leading up to retirement as dollar value
		System.out.printf("You must save $%.2f per month to achieve your retirement goal.", monthly_rate);
		
	}

}
