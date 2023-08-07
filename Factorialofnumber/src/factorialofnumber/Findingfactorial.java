package factorialofnumber;

import java.util.Scanner;

public class Findingfactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		int fact = 1;
		for (int i=1;i<=n;i++) {
			 fact = fact*i;	
		}
		System.out.println("factorial of "+n+" is "+fact);
		scan.close();

	}

}
