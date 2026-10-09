package tests;

import dominio.Circulo;
import dominio.Figura;
import dominio.Rectangulo;

public class Test02Polimorfismo {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(1,2,3,4);
		Circulo c1 = new Circulo(1,2,3);
		Rectangulo r1 = new Rectangulo(5,4,3,2);

		Figura[] ff = {r, c1, r1};
		
		double areaTotal = sumaAreas(ff);
		System.out.println(areaTotal);
	}
	
	public static double sumaAreas(Figura[] figs) {
		double area = 0;
		for (int i = 0; i < figs.length; i++) {
			area += figs[i].area();
		}
		return area;
	}
}
