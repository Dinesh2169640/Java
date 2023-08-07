package discount;

import java.util.Scanner;

public class DiscountApplicableornt {
	public static void checkDiscount(double purchaseAmount){
		if (purchaseAmount>100)
			System.out.println("Discount is Applicable");
		else
			System.out.println("Discount is not Applicable");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter purchaseAmount");
		double purchaseAmount = scan.nextDouble();
		checkDiscount(purchaseAmount);
		scan.close();
	}
}
