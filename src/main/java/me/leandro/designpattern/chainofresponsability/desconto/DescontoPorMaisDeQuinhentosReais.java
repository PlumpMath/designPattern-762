package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorMaisDeQuinhentosReais extends Desconto {

	public DescontoPorMaisDeQuinhentosReais() {
	}

	public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
		super(proximo);
	}

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		return proximoDesconto(orcamento);
	}
}
