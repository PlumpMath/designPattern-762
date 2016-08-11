package me.leandro.designpattern.strategy.investimento;

public class Moderado implements Investimento {

	@Override
	public double investir(Conta conta) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		if (escolhido) {
			return conta.getSaldo() * 0.007;
		}
		return conta.getSaldo() * 0.025;
	}

}
