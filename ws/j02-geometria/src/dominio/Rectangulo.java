package dominio;

public class Rectangulo extends Figura {

	public double lado1;
	public double lado2;
	
	public Rectangulo() {}
	
	public Rectangulo(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double area() {
		return lado1 * lado2;
	}
	
	public double perimetro() {
		return 2 * (lado1 + lado2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Rectangulo otro = (Rectangulo)o;
		return this.lado1 == otro.lado1 && this.lado2 == otro.lado2;
	}
}
