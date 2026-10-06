package ejercicios;

import java.util.Scanner;

public class Ej0207 {
	public static void main(String[] args) {
		var tec = new Scanner(System.in);
		
		int num, fact = 1;
		
		System.out.print("Ingrese valor entero menor que 15: ");
		num = tec.nextInt();
		
//		for (int i = num; i >= 2; i--) {
//			fact *= i;
//		}
		
		for (int i = 2; i <= num; i++)
			fact *= i;
		
		System.out.println(num + "! = " + fact);
	}
}
