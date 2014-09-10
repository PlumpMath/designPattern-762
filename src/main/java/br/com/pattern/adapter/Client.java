package br.com.pattern.adapter;

public class Client {

	public static void main(String[] args) {

		InterfaceEsperada[] target = new InterfaceEsperada[2];
		target[0] = new Adaptador();
		target[1] = new Adaptador();

		for (int i = 0; i < target.length; i++) {
			target[i].operacao();
		}

	}
}
