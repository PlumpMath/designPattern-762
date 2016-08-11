package me.leandro.designpattern.strategy.investimento;

public class Arrojado implements Investimento {

	@Override
	public double investir(Conta conta) {
		double escolhido = new java.util.Random().nextDouble();
		if (escolhido <= 0.20) {
			return conta.getSaldo() * 0.05;
		} else if (escolhido > 0.20 && escolhido <= 0.30) {
			return conta.getSaldo() * 0.03;
		}
		return conta.getSaldo() * 0.06;
	}

}
