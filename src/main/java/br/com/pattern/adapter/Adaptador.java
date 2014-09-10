package br.com.pattern.adapter;

public class Adaptador extends ClasseDesconhecida implements InterfaceEsperada {

	public void operacao() {
		String valueRecebido = metodo2("metodo 2");
		metodo1(valueRecebido);
	}

}
