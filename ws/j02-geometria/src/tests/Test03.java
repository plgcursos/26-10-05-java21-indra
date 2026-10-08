package tests;

import dominio.Circulo;

public class Test03 {
	public static void main(String[] args) {
		
		Circulo c = new Circulo(1,2,3);
		
		System.out.println(c);
		
		Circulo c1 = new Circulo(1,2,3);
		
		System.out.println(c == c1);
		System.out.println(c.equals(c1));
		
		

		
	}
}
