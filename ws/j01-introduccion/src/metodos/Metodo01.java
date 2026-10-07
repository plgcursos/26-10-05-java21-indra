package metodos;

public class Metodo01 {

	public static void main(String[] args) {
		System.out.println(suma(6, 89));
		System.out.println(suma(6, 89.0));
	}
	
	public static int suma(int a, int b) {  //firma: suma(int, int)
		System.out.println("int");
		return a + b;
	}
	
	public static double suma(double a, double b) {  //firma:  suma(double, double)
		System.out.println("double");
		return a + b;
	}
	
//	public static long suma(int x, int y) { tiene la misma firma suma(int, int)
//		return x + y;
//	}
}
