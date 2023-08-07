package agecatogerizer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Age");
		int a = scan.nextInt();
		catogerizeAge(a);
        scan.close();
	}
	public static void catogerizeAge(int age) {
		if(age>0&&age<=12)
			System.out.println("child");
		else if(age>=13&&age<=19)
			System.out.println("Teen");
		else if(age>=20&&age<=59)
			System.out.println("Adult");
		else if(age>=60)
			System.out.println("Senoir");
		else
			System.out.println("Invalid Age");
	}

}
