package br.com.pattern;

public class Singleton {

	private static String instancia = null;

	private Singleton() {

	}

	public static String getUnicaInstanciaString() {
		if (instancia == null) {
			instancia = new String("Apenas uma instancia.");
		}
		return instancia;
	}

	public static void main(String[] args) {
		String value1 = Singleton.getUnicaInstanciaString();
		String value2 = Singleton.getUnicaInstanciaString();

		System.out.println(value1);
		System.out.println(value2);

		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
	}

}
