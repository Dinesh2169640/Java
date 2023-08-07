package factorsofnumber;

import java.util.Scanner;

public class FindingFactors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to find the factors");
		int n = scan.nextInt();
		int c = 0;
		for (int i=1;i<=n;i++) {
			 if (n%i==0) {
		        System.out.print(i+" ");
			    c++;
			 }
		}
		System.out.println();
		System.out.println("the factors count is "+c);
		scan.close();
	}
}
