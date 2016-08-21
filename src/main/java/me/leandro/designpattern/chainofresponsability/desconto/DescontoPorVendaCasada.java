package me.leandro.designpattern.chainofresponsability.desconto;

public class DescontoPorVendaCasada extends TemplateDesconto {

	public DescontoPorVendaCasada() {
	}

	public DescontoPorVendaCasada(TemplateDesconto proximo) {
		super(proximo);
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		return orcamento.getItens().stream().anyMatch(item -> item.getNome().equals(nomeDoItem.toLowerCase()));
	}

	@Override
	protected boolean aptoReceberDesconto(Orcamento orcamento) {
		return aconteceuVendaCasadaEm(orcamento);
	}

	@Override
	protected double aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}
