package dominio;

public class Circulo extends Figura {
	public double radio;
	
	public Circulo() {
	}
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public double diametro() {
		return 2 * radio;
	}
	
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double perimetro() {
		return Math.PI * diametro();
	}
	
	public String toString() {
		return "Circulo(" + x + ", " + y + ", " + radio + ")";
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Circulo otro = (Circulo)o;
		return this.radio == otro.radio;
	}
}
