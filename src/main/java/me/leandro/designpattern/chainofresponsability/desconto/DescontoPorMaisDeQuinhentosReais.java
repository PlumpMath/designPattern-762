package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public double deconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		return proximo.deconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
