package sumofnumbers;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		int sum = 0;
		for (int i=1;i<=n;i++) {
			 sum = sum+i;	
		}
		System.out.println("sum of first "+n+" natural numbers is"+sum);
		scan.close();
	}

}
