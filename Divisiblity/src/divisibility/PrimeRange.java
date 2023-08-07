package divisibility;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range to print prime numbers");
		int n = scan.nextInt();
		int c = 0;
		for(int i=3;i<=n;i++) {
			 int res = checkPrime(i);
			 if(res!=0) {
				 System.out.print(i+" ");
				 c++;
			 }
		
		}
		scan.close();
		System.out.println();
		System.out.println("the count of prime numbers is"+c);
	}
	public static int checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return 0;
		}
		return n;
	}
}
