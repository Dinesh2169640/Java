package galacticaddition;

import java.util.Scanner;

public class GalacticAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long m = scan.nextLong();
		System.out.println(galacticAddition(n,m));
		
	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
