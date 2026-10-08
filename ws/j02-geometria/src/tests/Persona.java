package tests;

public class Persona extends Ente {
	String nombre;
	String apellidos;
	String domicilio;
	double saldo;
	int edad;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apellidos) {
		this(nombre);
		this.apellidos = apellidos;
	}
	
	public Persona(String nombre, String apellidos, String domicilio) {
		this(nombre, apellidos);
		this.domicilio = domicilio;
	}
}
