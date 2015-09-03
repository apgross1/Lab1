package savingsCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization of input method
		Scanner user_input = new Scanner(System.in);
		
		//Each block of code contain a single prompt and conversion into int value
		//I'm wondering whether or not this can be consolidated via while/for loop...testestest
		String work_years_str;
		System.out.println("How many years do you intend to work?");
		work_years_str = (user_input.next());
		int work_years;
		work_years = Integer.parseInt(work_years_str);
		
		String avg_return_str;
		System.out.println("What is your average expected return on investment?");
		avg_return_str = (user_input.next());
		int avg_return;
		avg_return = Integer.parseInt(avg_return_str);
		
		String draw_funds_str;
		System.out.println("How long do you intend to draw from Social Security?");
		draw_funds_str = (user_input.next());
		int draw_funds;
		draw_funds = Integer.parseInt(draw_funds_str);
		
		String req_incm_str;
		System.out.println("What is your required income?");
		req_incm_str = (user_input.next());
		int req_incm;
		req_incm = Integer.parseInt(req_incm_str);
		
		String SSI_incm_str;
		System.out.println("What is your expected Social Security income?");
		SSI_incm_str = (user_input.next());
		int SSI_incm;
		SSI_incm = Integer.parseInt(SSI_incm_str);
		

	}

}
