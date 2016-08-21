package me.leandro.designpattern.template.imposto;

import me.leandro.designpattern.chainofresponsability.desconto.Item;
import me.leandro.designpattern.strategy.primeiro.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean itemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && itemMaiorQue100ReaisNo(orcamento);
	}

}
