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
		double avg_return_invest = user_input.nextDouble();
		
		System.out.println("What is your average expected return on paypack? (0-3%");
		double avg_return_payback = user_input.nextDouble();
		
		System.out.println("How long do you intend to draw from Social Security?");
		int draw_funds = user_input.nextInt();
		
		System.out.println("What is your required income?");
		int req_incm = (user_input.nextInt());
		
		System.out.println("What is your expected Social Security income?");
		int SSI_incm = user_input.nextInt();

		double total_savings = (req_incm - SSI_incm) * 20;
		double savings_retirement = total_savings/Math.pow(avg_return_payback, draw_funds);
		double savings_invested = savings_retirement/Math.pow(avg_return_invest, work_years);
		double monthly_savings = savings_invested/12;
		System.out.println("You must save $" + monthly_savings + " per month to achieve your retirement goal.");
		
	}

}
