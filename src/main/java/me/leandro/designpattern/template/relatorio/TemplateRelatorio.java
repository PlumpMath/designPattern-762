package me.leandro.designpattern.template.relatorio;

import java.util.List;

public abstract class TemplateRelatorio implements Relatorio {

	@Override
	public void gerarRelatorio(List<Conta> contas) {
		cabecalho();
		relatorio(contas);
		rodape();
	}

	protected abstract void cabecalho();

	protected abstract void relatorio(List<Conta> contas);

	protected abstract void rodape();

}
