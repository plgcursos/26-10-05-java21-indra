package dominio;

public interface Imprimible {

	static int algo = 55;
	
	//public abstract
	void print();
	
	public default void metodoNuevo() {
		metodoAuxiliarDef();
		System.out.println("Soy un metodo default!!!");
	}
	
	public static void metodoEstatico() {
		metodoEstaticoPriv();
		System.out.println("soy un metodo estatico");
	}
	
	private void metodoAuxiliarDef() {
		
	}
	
	private static void metodoEstaticoPriv() {
		
	}
}
