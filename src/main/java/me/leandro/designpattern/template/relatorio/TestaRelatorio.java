package me.leandro.designpattern.template.relatorio;

import java.util.Arrays;
import java.util.List;

public class TestaRelatorio {

	public static void main(String[] args) {
		List<Conta> contas = Arrays.asList(new Conta("Leandro", 100.0, "1234", "4567-X"),
				new Conta("John", 200.0, "87923", "23939"));

		Relatorio relatorio = new RelatorioComplexo();
		relatorio.gerarRelatorio(contas);
	}
}
