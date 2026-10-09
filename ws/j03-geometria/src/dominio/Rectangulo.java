package dominio;

public class Rectangulo extends Figura {

	private double lado1;
	private double lado2;
	
	public Rectangulo() {}
	
	public Rectangulo(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public double area() {
		return lado1 * lado2;
	}
	
	@Override
	public double perimetro() {
		return 2 * (lado1 + lado2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Rectangulo otro = (Rectangulo)o;
		return this.lado1 == otro.lado1 && this.lado2 == otro.lado2;
	}

	@Override
	public String toString() {
		return "Rectangulo (" + getX() + ", " + getY() + ", " + lado1 + ", " + lado2 + ")";
	}
	
}
