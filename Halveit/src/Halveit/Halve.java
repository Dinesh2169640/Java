package Halveit;

import java.util.Scanner;

public class Halve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		double n = scan.nextDouble();
		System.out.printf("%.2f",halveTheNumber(n));
	}
	public static double halveTheNumber(double num) {
		return num/2;
	}

}
