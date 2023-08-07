package vendingsimulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the product code");
        String productCode = scan.next();
        getProduct(productCode);
        scan.close();
}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":
     		System.out.println("Coca Cola");
     		break;
		case "P02":
			System.out.println("Sprite");
			break;
		case "P03":
			System.out.println("thumps up");
			break;
		case "P04":
			System.out.println("mazaa");
			break;	
		default:
			System.out.println("water");
			break;
		}
}
}
