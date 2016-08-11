package me.leandro.designpattern.strategy.investimento;

public class Conservador implements Investimento {

	@Override
	public double investir(Conta conta) {
		return conta.getSaldo() * 0.08;
	}

}
