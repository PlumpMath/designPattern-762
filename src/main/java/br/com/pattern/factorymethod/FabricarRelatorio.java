package br.com.pattern.factorymethod;

public class FabricarRelatorio {

	public static Relatorio criarRelatorio(String tipo) {
		if (tipo.equalsIgnoreCase("pdf")) {
			return new Pdf();
		} else if (tipo.equalsIgnoreCase("doc")) {
			return new Doc();
		}
		throw new IllegalArgumentException("tipo inválido");

	}

}
