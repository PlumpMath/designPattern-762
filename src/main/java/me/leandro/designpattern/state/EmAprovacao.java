package me.leandro.designpattern.state;

import me.leandro.designpattern.strategy.primeiro.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.alterarValor(orcamento.getValor() - orcamento.getValor() * 0.05);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.alterarEstadoAtual(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.alterarEstadoAtual(new Reprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos em aprovacao nao podem ir direto para finalizado");
	}

}
