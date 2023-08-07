package primeornot;

import java.util.Scanner;

public class FindingPrimeorNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		if(n<2)
			System.out.println("entered number is prime");
		boolean isPrime = false;
		for(int i=2;i*i<n;i++) {
			if(n%i==0)
				isPrime = true;
		}
		if(isPrime==false)
			System.out.println("entered number is prime");
		else
			System.out.println("entered number is not prime");
        scan.close();
	}
}
