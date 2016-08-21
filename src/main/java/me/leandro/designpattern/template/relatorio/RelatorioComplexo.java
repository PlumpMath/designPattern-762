package me.leandro.designpattern.template.relatorio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void cabecalho() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco do Brasil\n");
		builder.append("Setor bancário Sul\n");
		builder.append("(61) 3322-9900\n");
		System.out.println(builder.toString());
	}

	@Override
	protected void rodape() {
		StringBuilder builder = new StringBuilder();
		builder.append("contato@bb.com.br\n");
		builder.append(new SimpleDateFormat("dd/MM/yyyy").format(new Date()) + "\n");
		System.out.println(builder.toString());
	}

	@Override
	protected void relatorio(List<Conta> contas) {
		StringBuilder builder = new StringBuilder();
		for (Conta conta : contas) {
			builder.append(conta.getTitular() + " - " + conta.getSaldo() + " - " + conta.getAgencia() + " - "
					+ conta.getNumero() + "\n");
		}
		System.out.println(builder.toString());
	}

}
