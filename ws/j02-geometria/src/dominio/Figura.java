package dominio;

public class Figura {

	private double x;
	private double y;
	
	public Figura() {}
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double area() {
		return 0;
	}
	
	public double perimetro() {
		return 0;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (this.getClass() != o.getClass()) return false;
		Figura otra = (Figura)o;
		return this.x == otra.x && this.y == otra.y;
	}
}
