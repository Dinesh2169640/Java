package TheFinanceCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Principal Amount");
		double P = scan.nextDouble();
		System.out.println("enter the rate of Interest");
		double r = scan.nextDouble();
		System.out.println("enter the time in years");
		double t =scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(P,t,r));
		

	}

}
