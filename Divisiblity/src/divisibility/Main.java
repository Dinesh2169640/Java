package divisibility;

public class Main {

	public static void main(String[] args) {
		System.out.println("the even numbers in the range of 100");
		Methods.divisibleBy2();
		System.out.println();
		System.out.println("the numbers divisible 3 in the range of 100");
		Methods.divisibleBy3();
		System.out.println();
		System.out.println("the numbers divisible by 5 in the range of 100");
		Methods.divisibleBy5();
		System.out.println();
		System.out.println("the numbers divisible by 2 and 5 in the range of 100");
		Methods.divisibleBy2And5();
		System.out.println();
		System.out.println("the numbers divisible by 3 and 5 in the range of 100");
		Methods.divisibleBy3And5();
		System.out.println();
		System.out.println("the numbers divisible by 3 and even in the range of 100");
		Methods.divisibleBy3AndEven();
		System.out.println();
		System.out.println("the numbers divisible by 5 and odd in the range of 100");
		Methods.divisibleBy5AndOdd();
		System.out.println();
		System.out.println(" the prime numbers in the range of 100");
		Methods.prime();
		System.out.println();
		System.out.println(" the prime number and odd in the range of 100");
		Methods.primeAndOdd();
	}

}
