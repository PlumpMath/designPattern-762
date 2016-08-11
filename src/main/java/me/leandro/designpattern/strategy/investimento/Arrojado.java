package me.leandro.designpattern.strategy.investimento;

public class Arrojado implements Investimento {

	@Override
	public double investir(Conta conta) {
		if (new java.util.Random().nextDouble() <= 0.20) {
			return conta.getSaldo() * 0.05;
		} else if (new java.util.Random().nextDouble() > 0.20 && new java.util.Random().nextDouble() <= 0.30) {
			return conta.getSaldo() * 0.03;
		}
		return conta.getSaldo() * 0.06;
	}

}
