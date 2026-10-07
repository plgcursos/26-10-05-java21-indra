package objetos.string;

public class TextBlock {

	public static void main(String[] args) {
		
		String sql1 = 
			"select nombre, apellidos, telefono "
			+ "from clientes left join facturas on id_cliente = fk_cliente "
			+ "left join productos on fk_producto = id_producto "
			+ "where nombre = \"%s\"".formatted("Juan");
		
		System.out.println(sql1);
		System.out.println();

		String sql2 = 
			"""
			select nombre, apellidos, telefono from clientes
			  left join facturas on id_cliente = fk_cliente
			  left join productos on fk_producto = id_producto
			  where nombre = "%s"

			""".formatted("Juan");
		System.out.println(sql2);
	}
}
