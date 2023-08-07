package divisibility;

public class Methods {
	public static void divisibleBy2() {
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
	public static void divisibleBy3() {
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				System.out.print(i+" ");
		}
	}
	public static void divisibleBy5() {
		for(int i=1;i<=100;i++) {
			if(i%5==0)
				System.out.print(i+" ");
		}
	}
	public static void divisibleBy2And5() {
		for(int i=1;i<=100;i++) {
			if(i%2==0&&i%5==0)
				System.out.print(i+" ");
		}
	}
	public static void divisibleBy3And5() {
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%5==0)
				System.out.print(i+" ");
		}
	}
	public static void divisibleBy3AndEven() {
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%2==0)
				System.out.print(i+" ");
		}
	}
	public static void divisibleBy5AndOdd() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0&&i%5==0)
				System.out.print(i+" ");
		}
	}
	public static void prime() {
		for(int i=3;i<=100;i++) {
			 int res = checkPrime(i);
			 if(res!=0)
				 System.out.print(i+" ");
		}
	}
	public static int checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return 0;
		}
		return n;
	}
	public static void primeAndOdd() {
		for(int i=3;i<=100;i++) {
			if(i%2!=0) {
			 int res = checkPrime(i);
			 if(res!=0)
				 System.out.print(i+" ");
			}
		}
	}

}
