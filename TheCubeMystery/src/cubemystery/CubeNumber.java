package cubemystery;

import java.util.Scanner;

public class CubeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		System.out.println(cubeNumber(n));
		
	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}
