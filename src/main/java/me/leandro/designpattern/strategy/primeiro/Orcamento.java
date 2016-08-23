package me.leandro.designpattern.strategy.primeiro;

import java.util.List;

import me.leandro.designpattern.chainofresponsability.desconto.Item;
import me.leandro.designpattern.state.EmAprovacao;
import me.leandro.designpattern.state.EstadoDeUmOrcamento;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	private EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		estadoAtual = new EmAprovacao();
	}

	public void alterarValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void alterarEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
