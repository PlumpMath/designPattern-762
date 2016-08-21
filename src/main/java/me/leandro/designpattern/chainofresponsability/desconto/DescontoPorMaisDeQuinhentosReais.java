package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorMaisDeQuinhentosReais extends TemplateDesconto {

	public DescontoPorMaisDeQuinhentosReais() {
	}

	public DescontoPorMaisDeQuinhentosReais(TemplateDesconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean aptoReceberDesconto(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	protected double aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
}
