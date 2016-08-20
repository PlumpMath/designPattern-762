package me.leandro.designpattern.chainofresponsability.desconto;

public abstract class Desconto {

	static final double SEM_DESCONTO = 0.0;

	private Desconto proximo;

	protected Desconto() {
	}

	protected Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	abstract double desconta(Orcamento orcamento);

	double proximoDesconto(Orcamento orcamento) {
		return existeProximo() ? proximo.desconta(orcamento) : SEM_DESCONTO;
	}

	private boolean existeProximo() {
		return proximo != null;
	}

}
