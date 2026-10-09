package tests;

import dominio.Circulo;
import dominio.Rectangulo;

public class Test03InstanceOf {

	public static void main(String[] args) {
		Circulo c = new Circulo(1,2,3);
		Rectangulo r = new Rectangulo(4, 4, 5, 7);
		
		procesa1(r);
		procesa1(c);
		procesa1("hola que tal");
		System.out.println("--------------");
		procesa17(r);
		procesa17(c);
		procesa17("hola que tal");
		System.out.println("--------------");
		procesa21(r);
		procesa21(c);
		procesa21("hola que tal");
		procesa21(new int[] {1,2,3});
		
	}
	
	//instanceof uso tradicional
	public static void procesa1(Object o) {
		if (o instanceof Rectangulo) {
			Rectangulo r = (Rectangulo) o;
			System.out.println(r.diagonal());
		} else
			System.out.println("No es un rectangulo");
	}
	
	// Java 17 - Pattern matching
	public static void procesa17(Object o) {
		if (o instanceof Rectangulo r) {
			System.out.println(r.diagonal());
		} else
			System.out.println("No es un rectangulo");
	}
	
	// Java 21 - Pattern matching in switch
	public static void procesa21(Object o) {
		switch (o) {
		case Rectangulo r -> System.out.println(r.diagonal());
		case Circulo c -> System.out.println(c.diametro());
		case String s -> System.out.println(s.toUpperCase());
		default -> System.out.println("Es otro tipo de objeto");
		}
	}
}
