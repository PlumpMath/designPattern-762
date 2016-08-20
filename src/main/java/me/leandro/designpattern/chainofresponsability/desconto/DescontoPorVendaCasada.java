package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorVendaCasada extends Desconto {

	public DescontoPorVendaCasada() {
	}

	public DescontoPorVendaCasada(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximoDesconto(orcamento);
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		return orcamento.getItens().stream().anyMatch(item -> item.getNome().equals(nomeDoItem.toLowerCase()));
	}
}
