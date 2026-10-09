package dominio;

public class Circulo extends Figura implements Imprimible {
	private double radio;
	
	public Circulo() {
	}
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public double diametro() {
		return 2 * radio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public double perimetro() {
		return Math.PI * diametro();
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String toString() {
		return "Circulo(" + getX() + ", " + getY() + ", " + radio + ")";
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Circulo otro = (Circulo)o;
		return this.radio == otro.radio;
	}

	@Override
	public void print() {
		System.out.println("Imprime el circulito!!");
		
	}
}
