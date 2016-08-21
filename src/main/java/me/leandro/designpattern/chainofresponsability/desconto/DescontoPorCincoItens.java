package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorCincoItens extends TemplateDesconto {

	public DescontoPorCincoItens() {
	}

	public DescontoPorCincoItens(TemplateDesconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean aptoReceberDesconto(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}

	@Override
	protected double aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
