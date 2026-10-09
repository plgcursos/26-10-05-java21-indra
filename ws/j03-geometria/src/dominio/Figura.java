package dominio;

import java.util.Objects;

public abstract class Figura {

	private double x;
	private double y;
	
	public Figura() {
	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract double area();
	
	public abstract double perimetro();

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

	@Override
	public int hashCode() {
		return Objects.hash(Double.valueOf(x), Double.valueOf(y));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
}
