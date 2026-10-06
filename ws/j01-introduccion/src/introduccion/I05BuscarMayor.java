package introduccion;

public class I05BuscarMayor {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = 57;
		num2 = -9;
		num3 = 45;
		String mensaje;

//		if (num1 >= num2 && num1 >= num3) {
//			mensaje = "el primero";
//		} else if (num2 >= num3) {
//			mensaje = "el segundo";
//		} else {
//			mensaje = "el tercero";
//		}

		if (num1 >= num2 && num1 >= num3)
			mensaje = "el primero";
		else if (num2 >= num3)
			mensaje = "el segundo";
		else
			mensaje = "el tercero";
		
		System.out.println("El mayor es " + mensaje);
	}
}
