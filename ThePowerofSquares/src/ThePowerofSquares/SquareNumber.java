package ThePowerofSquares;

import java.util.Scanner;

public class SquareNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num) {
		return num*num;
	}

}
