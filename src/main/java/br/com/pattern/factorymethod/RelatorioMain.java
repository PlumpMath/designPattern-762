package br.com.pattern.factorymethod;

public class RelatorioMain {

	public static void main(String[] args) {
		String tipo = "Doc";
		Relatorio relatorio = FabricarRelatorio.criarRelatorio(tipo);
		System.out.println(relatorio.gerarRelatorio());
	}
}
