package ejercicios;

import java.util.Scanner;

public class Ej0306 {
	public static void main(String[] args) {
		var tec = new Scanner(System.in);
		int num, inv = 0, aux, digito;
		
		System.out.print("Ingrese valor entero: ");
		aux = num = tec.nextInt();
		
		while(aux != 0) {
			digito = aux % 10;
			inv = inv * 10 + digito;
			aux /= 10;
		}
		
		System.out.println(num + " >> " + inv);
	}
}
