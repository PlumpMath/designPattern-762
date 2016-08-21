package me.leandro.designpattern.template.imposto;

import java.util.Collections;

import me.leandro.designpattern.chainofresponsability.desconto.Item;
import me.leandro.designpattern.strategy.primeiro.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (Collections.frequency(orcamento.getItens(), item) > 1) {
				return true;
			}
		}
		return false;
	}
}
