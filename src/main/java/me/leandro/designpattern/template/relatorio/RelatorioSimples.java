package me.leandro.designpattern.template.relatorio;

import java.util.List;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco do Brasil\n");
	}

	@Override
	protected void rodape() {
		System.out.println("(61) 3322-9900");
	}

	@Override
	protected void relatorio(List<Conta> contas) {
		StringBuilder builder = new StringBuilder();
		for (Conta conta : contas) {
			builder.append(conta.getTitular() + " - " + conta.getSaldo() + "\n");
		}
		System.out.println(builder.toString());
	}

}
