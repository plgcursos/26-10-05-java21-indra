package tests;

import dominio.Circulo;
import dominio.Figura;
import dominio.Rectangulo;

public class Test01 {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(45, -0.5, 10);
//		c.x = 45;
//		c.y = -0.5;
//		c.radio = 10;
		
		System.out.println(c.area());
		System.out.println(c.diametro());
		System.out.println(c.perimetro());
		
		Rectangulo r = new Rectangulo(1,2,3,4);
		System.out.println(r.area());
		System.out.println(r.perimetro());
		System.out.println(r.diagonal());
		
		System.out.println(r.getX() - c.getX());
		
//		Figura f = new Figura(); no lo permite porque Figura es abstracta
	}
}
