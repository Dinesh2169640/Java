package TimeConverter;

import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the time in minutes");
		double t = scan.nextDouble();
		System.out.println(TimeConverter.convertToHours(t));
	}
}



