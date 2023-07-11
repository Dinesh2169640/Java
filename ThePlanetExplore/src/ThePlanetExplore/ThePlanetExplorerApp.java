package ThePlanetExplore;

import java.util.Scanner;

public class ThePlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radious");
		double r = scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f",explorer.calculateSurfaceArea(r));
	}
}
