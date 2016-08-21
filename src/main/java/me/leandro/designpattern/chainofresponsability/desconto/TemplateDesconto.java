package me.leandro.designpattern.chainofresponsability.desconto;

public abstract class TemplateDesconto implements Desconto {

	static final double SEM_DESCONTO = 0.0;

	private TemplateDesconto proximo;

	protected TemplateDesconto() {
	}

	protected TemplateDesconto(TemplateDesconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public final double desconta(Orcamento orcamento) {
		if (aptoReceberDesconto(orcamento)) {
			return aplicarDesconto(orcamento);
		}
		return proximoDesconto(orcamento);
	}

	double proximoDesconto(Orcamento orcamento) {
		return existeProximo() ? proximo.desconta(orcamento) : SEM_DESCONTO;
	}

	private boolean existeProximo() {
		return proximo != null;
	}

	protected abstract boolean aptoReceberDesconto(Orcamento orcamento);

	protected abstract double aplicarDesconto(Orcamento orcamento);

}
