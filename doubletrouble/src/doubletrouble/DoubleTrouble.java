package doubletrouble;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		 int res = doubleTheNumber(n);
		 System.out.println(res);
		
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

	}


