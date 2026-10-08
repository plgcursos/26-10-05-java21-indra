package objetos.string;

public class Concatenacion {
	public static void main(String[] args) {
		String s = "";
		StringBuilder sb = new StringBuilder();
		StringBuffer sf = new StringBuffer();
		
		long t0, tf;
		
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= 300_000; i++) {
			s += "x";
		}
		tf = System.currentTimeMillis();
		System.out.println(s.length());
		System.out.println("String: " +(tf - t0));
		
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= 1_000_000; i++) {
			sb.append("x");
		}
		tf = System.currentTimeMillis();
		System.out.println(sb.length());
		System.out.println("StringBuilder: " +(tf - t0));
		
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= 1_000_000; i++) {
			sf.append("x");
		}
		tf = System.currentTimeMillis();
		System.out.println(sf.length());
		System.out.println("StringBuffer: " +(tf - t0));
		
		String resultado = sf.toString();
	}
}
