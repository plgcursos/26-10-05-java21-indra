package objetos.array;

public class Array01 {
	public static void main(String[] args) {
		
		int[] v1 = {4, 9, 0, -3, 8};
		muestra(v1);
		
		int[] v2 = new int[7];
		muestra(v2);
	}
	
	public static void muestra(final int[] v) {
		System.out.print("[");
		for (int i = 0; i < v.length - 1; i++) {
			System.out.print(v[i] + ", ");
		}
		System.out.println(v[v.length -1] + "]");
	}
}
