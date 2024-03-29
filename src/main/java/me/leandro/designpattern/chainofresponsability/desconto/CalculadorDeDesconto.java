package me.leandro.designpattern.chainofresponsability.desconto;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto desconto = new DescontoPorCincoItens(
				new DescontoPorMaisDeQuinhentosReais(new DescontoPorVendaCasada()));
		return desconto.desconta(orcamento);
	}

}
