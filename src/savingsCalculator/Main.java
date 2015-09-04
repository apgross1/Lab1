package savingsCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization of input method
		Scanner user_input = new Scanner(System.in);
		
		//Each block of code contain a single prompt and conversion into int value
		//I'm wondering whether or not this can be consolidated via while/for loop...
		System.out.println("How many years do you intend to work?");
		int work_years = user_input.nextInt();
		
		System.out.println("What is your average expected return on investment?");
		double avg_return = user_input.nextDouble();

		System.out.println("How long do you intend to draw from Social Security?");
		int draw_funds = user_input.nextInt();
		
		System.out.println("What is your required income?");
		int req_incm = (user_input.nextInt());
		
		System.out.println("What is your expected Social Security income?");
		int SSI_incm = user_input.nextInt();

	}

}
