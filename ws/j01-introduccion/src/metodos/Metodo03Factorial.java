package metodos;

public class Metodo03Factorial {

	public static long factorial(long n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
	
	public static long factorialIt(long n) {
		long fact = 1;
		
		for (int i = 2; i <= n; i++)
			fact *= i;

		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialIt(5));
	}
}
