package me.leandro.designpattern.strategy.primeiro;

import java.util.List;

import me.leandro.designpattern.chainofresponsability.desconto.Item;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}
}
