package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorCincoItens extends Desconto {

	public DescontoPorCincoItens() {
	}

	public DescontoPorCincoItens(Desconto proximo) {
		super(proximo);
	}

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximoDesconto(orcamento);
	}
}
