package introduccion;

import java.util.Scanner;

public class I07SwitchExpression {

	public static void main(String[] args) {
		var tec = new Scanner(System.in);
		int dia;
		String nombreDia;
		
		System.out.print("Ingresa nro dia: ");
		dia = tec.nextInt();
		
		nombreDia = switch(dia) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miercoles";
		case 4 -> "Jueves";
		case 5 -> "Viernes";
		case 6 -> "Sabado";
		case 7 -> "Domingo";
		case 8, 9, 10 -> "menor que 10";
		default -> {
			System.out.println("estoy haciendo log");
			yield "error";
			}
		};
		
		System.out.println(nombreDia);
		
	}
}
