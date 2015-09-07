package savingsCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization of input method
		Scanner user_input = new Scanner(System.in);
		
		//Each block of code contain a single prompt
		//I'm wondering whether or not this can be consolidated via while/for loop...
		System.out.println("How many years do you intend to work?");
		int work_years = user_input.nextInt();
		
		System.out.println("What is your average expected return on investment? (0-20%");
		double avg_return_invest = (user_input.nextDouble())/100;
		
		System.out.println("What is your average expected return on paypack? (0-3%)");
		double avg_return_payback = (user_input.nextDouble())/100;
		
		System.out.println("How long do you intend to draw from Social Security?");
		int draw_years = user_input.nextInt();
		
		System.out.println("What is your required income?");
		double req_incm = (user_input.nextDouble());
		
		System.out.println("What is your expected Social Security income?");
		double SSI_incm = user_input.nextDouble();
		
		user_input.close();

		double total_savings = (req_incm - SSI_incm);
		System.out.println("Total savings is " + total_savings);
		double savings_retirement = total_savings * (1 - (1/(Math.pow((1+avg_return_payback/12), draw_years*12))))/(avg_return_payback/12); 
		System.out.println("Savings retirement is " + savings_retirement);
		double interest_multiplier = (Math.pow(1 + (avg_return_invest/12), work_years*12) - 1) / (avg_return_invest/12);
		System.out.println("Interest multiplier is " + interest_multiplier);
		double monthly_rate = savings_retirement/interest_multiplier;
		System.out.printf("You must save $%.2f per month to achieve your retirement goal.", monthly_rate);
		
	}

}
