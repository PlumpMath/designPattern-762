package br.com.pattern.factorymethod;

public class Pdf implements Relatorio {

	public String gerarRelatorio() {
		return "PDF";
	}

}
