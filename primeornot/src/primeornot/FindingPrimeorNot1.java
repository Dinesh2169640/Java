package primeornot;

import java.util.Scanner;

public class FindingPrimeorNot1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				System.out.println("entered number is not prime");
				return;
			}
		}
		System.out.println(" entered number is prime ");
		scan.close();
	}
}
