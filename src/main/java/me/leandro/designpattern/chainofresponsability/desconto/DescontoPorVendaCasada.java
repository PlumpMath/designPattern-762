package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double deconta(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.deconta(orcamento);
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem.toLowerCase()))
				return true;
		}
		return false;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
