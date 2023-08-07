package polygonidentifier;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of sides of polygon");
        int sides = scan.nextInt();
        identifyPolygon(sides);
        scan.close();
	}
	public static void identifyPolygon(int sides) {
		switch(sides) {
		case 3:
     		System.out.println("Triangle");
     		break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Heptagon");
			break;
		case 8:
			System.out.println("octagon");
			break;
		case 9:
			System.out.println("nonagon");
			break;
		default:
			System.out.println("polygon");
			break;
		}
	}

}
