package introduccion;

import java.util.Scanner;

public class I03SumaNumeros {

	public static void main(String[] arg) {
		//Lea por teclado dos enteros y muestre la suma
		var nada = 0;
		int num1, num2, resu;
		var tec = new Scanner(System.in);
		
		System.out.print("Valor1: ");
		num1 = tec.nextInt();
		
		System.out.print("Valor2: ");
		num2 = tec.nextInt();
		
//		resu = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
}
