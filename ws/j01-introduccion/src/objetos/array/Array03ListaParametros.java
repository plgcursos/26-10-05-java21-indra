package objetos.array;

public class Array03ListaParametros {

//	public static int suma(int a, int b) {
//		return a + b;
//	}
//	
//	public static int suma(int a, int b, int c) {
//		return a + b + c;
//	}
	
	public static int suma(int... nums) {
		int suma = 0;
		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(suma(5, 8));
		System.out.println(suma(5, 8, 6));
		System.out.println(suma(5));
		System.out.println(suma(5, 3, 4, 6, 8, 77));
		System.out.println(suma(new int[] {1,2,3,4,5,6,7}));
	}
}
