package TemperatureCalculator;

import java.util.Scanner;

public class TheTemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double f = scan.nextDouble();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));

	}

}
