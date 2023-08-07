package MultipleOfTenChecker;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        CheckMultipleOften(n);
        scan.close();
	}
	public static void CheckMultipleOften(int n) {
		if(n%10==0)
			System.out.println("The Number "+n+" is a Multiple of 10");
		else
			System.out.println("The Number "+n+" is Not a Multiple of 10");
	}

	}


