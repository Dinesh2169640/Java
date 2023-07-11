package athimeticoperations;

import java.util.Scanner;

public class ArthimeticOperations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		 int res = subtractNumbers(num1, num2);

		int res1 =multiplyNumbers(num1, num2);

		double res2 = divideNumbers(num1, num2);

		 int res3 = findRemainder(num1, num2);
		 System.out.println(res);
		 System.out.println(res1);
		 System.out.printf("%.2f\n"+res2);
		 System.out.println(res3);
		
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
		
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
		
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
		
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
		
	}

}
