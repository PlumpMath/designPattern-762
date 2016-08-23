package me.leandro.designpattern.state;

import me.leandro.designpattern.strategy.primeiro.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser aprovados!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.alterarEstadoAtual(new Finalizado());
	}

}
