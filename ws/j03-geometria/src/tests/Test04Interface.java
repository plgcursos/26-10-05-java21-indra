package tests;

import dominio.Circulo;
import dominio.Imprimible;

public class Test04Interface {
	public static void main(String[] args) {
		
		Imprimible i = new Circulo(1,  2, 3);
		
		i.print();
		
		Circulo c = new Circulo(3,4,5);
		c.metodoNuevo();
		
		Imprimible.metodoEstatico();
	}
}
