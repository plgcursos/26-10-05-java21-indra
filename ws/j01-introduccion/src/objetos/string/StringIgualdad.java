package objetos.string;

public class StringIgualdad {
	public static void main(String[] args) {
		
		String s1 = new String("hola");
		String s2 = new String("hola");
//		s2 = s1;
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("--------------");
		
		String s3 = new String("Hola");
		String s4 = s3;
		System.out.println(s3 == s4);
		s3 += " y adios";  // s3 = s3 + "...";
		System.out.println(s3 == s4);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("--------------");
		
		String s5 = "hola";
		String s6 = "hola";
		
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
		System.out.println(s5.substring(1, 3).toUpperCase());
		
	}
}
