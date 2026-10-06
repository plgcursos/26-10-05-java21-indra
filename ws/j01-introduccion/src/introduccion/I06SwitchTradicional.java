package introduccion;

import java.util.Scanner;

public class I06SwitchTradicional {

	public static void main(String[] args) {
		var tec = new Scanner(System.in);
		int dia;
		String nombreDia;
		
		System.out.print("Ingresa nro dia: ");
		dia = tec.nextInt();
		
		switch(dia) {
		case 1: 
			nombreDia = "Lunes";
			break;
		case 2: 
			nombreDia = "Martes";
			break;
		case 3: 
			nombreDia = "Miercoles";
			break;
		case 4: 
			nombreDia = "Jueves";
			break;
		case 5: 
			nombreDia = "Viernes";
			break;
		case 6: 
			nombreDia = "Sabado";
			break;
		case 7: 
			nombreDia = "Domingo";
			break;
		case 8:
		case 9:
		case 10:
			nombreDia = "menor que 10";
			break;
		default:
			nombreDia = "error";
		}
		
		System.out.println(nombreDia);
		
	}
}
