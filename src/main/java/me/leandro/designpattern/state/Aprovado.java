package me.leandro.designpattern.state;

import me.leandro.designpattern.strategy.primeiro.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.alterarValor(orcamento.getValor() - orcamento.getValor() * 0.02);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.alterarEstadoAtual(new Finalizado());
	}
}
