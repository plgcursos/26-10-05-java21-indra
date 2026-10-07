package objetos.string.ejercicios;

public class Ej09 {

	public static boolean esPalindromo1(String s) {
		s = s.replace(" ", "").toLowerCase();
		String inv = "";
		for (int i = s.length() - 1; i >= 0; i--)
			inv += s.charAt(i);
		return s.equals(inv);
	}

	public static boolean esPalindromo2(String s) {
		s = s.replace(" ", "").toLowerCase();
		int i = 0, d = s.length() - 1;
		boolean esPalidromo = true;
		while (i < d && esPalidromo) {
			if (s.charAt(i) != s.charAt(d))
				esPalidromo = false;
			i++;
			d--;
		}
		return esPalidromo;
	}

	public static void main(String[] args) {
		String frase = "Dabale arroz a la zorra el Abad";
		
		System.out.println(esPalindromo1(frase));
		System.out.println(esPalindromo1("Hola"));
		
		System.out.println(esPalindromo2(frase));
		System.out.println(esPalindromo2("Hola"));
	}
}
