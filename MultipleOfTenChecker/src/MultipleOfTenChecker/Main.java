package MultipleOfTenChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n = scan.nextInt();
        int m = scan.nextInt();
        CheckMultipleOften(n,m);
        scan.close();
	}
	public static void CheckMultipleOften(int n, int m) {
		if(n%m==0)
			System.out.println("The Number "+n+" is a Multiple of "+m);
		else
			System.out.println("The Number "+n+" is Not a Multiple of "+m);
	}

}
