package me.leandro.designpattern.state;

import me.leandro.designpattern.strategy.primeiro.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprova(Orcamento orcamento);

	void finaliza(Orcamento orcamento);
}
