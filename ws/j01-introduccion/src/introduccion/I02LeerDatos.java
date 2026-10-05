package introduccion;

import java.util.Scanner;

public class I02LeerDatos {

	public static void main(String[] arg) {
		int num1 = 10;
		String nombre;

//		java.util.Scanner tec = new java.util.Scanner(System.in);
		
		Scanner tec = new Scanner(System.in);

		System.out.print("Ingresa tu nombre: ");
		nombre = tec.nextLine();
		
		System.out.println("Bienvenido " + nombre + " al curso de Java 21");
		
		System.out.print("Ingresa un valor entero: ");
		num1 = tec.nextInt();
		
		System.out.println("Has ingresado el " + num1);
	}
}
