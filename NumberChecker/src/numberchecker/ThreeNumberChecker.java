package numberchecker;

import java.util.Scanner;

public class ThreeNumberChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter three numbers");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int j = scan.nextInt();
		checkGreatest(n,m,j);
		scan.close();
	}
	public static void checkGreatest(int n,int m,int j) {
		
		if(n==m&&m==j&&n==j)
			System.out.println("entered three numbers are equal");
		else {
			if(n>m&&n>j)
				System.out.println("among three numbers " +n+" is the largest number");
			else if(m>n&&m>j)
				System.out.println("among three numbers " +m+" is the largest number");
			else
				System.out.println("among three numbers " +j+" is the largest number");
		}
	}
}
