package introduccion;

import java.util.Scanner;

public class I08NewSwitchStatement {

	public static void main(String[] args) {
		var tec = new Scanner(System.in);
		int dia;
		String nombreDia;
		
		System.out.print("Ingresa nro dia: ");
		dia = tec.nextInt();
		
		switch(dia) {
		case 1 -> nombreDia = "Lunes";
		case 2 -> nombreDia = "Martes";
		case 3 -> nombreDia = "Miercoles";
		case 4 -> nombreDia = "Jueves";
		case 5 -> nombreDia = "Viernes";
		case 6 -> nombreDia = "Sabado";
		case 7 -> nombreDia = "Domingo";
		case 8, 9, 10 -> nombreDia ="menor que 10";
		default -> nombreDia = "error";
		}
		
		System.out.println(nombreDia);
		
	}
}
