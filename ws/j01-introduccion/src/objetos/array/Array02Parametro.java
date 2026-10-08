package objetos.array;

public class Array02Parametro {
	
	public static void cambia(int a) {
		a = 99;
	}
	
	public static void cambia(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = 99;
		}
	}
	
	public static void main(String[] args) {
		int a = 0;
		cambia(a);
		System.out.println(a);
		
		int[] v1 = new int[10];
		Array01.muestra(v1);
		cambia(v1);
		Array01.muestra(v1);
	}
	
}
