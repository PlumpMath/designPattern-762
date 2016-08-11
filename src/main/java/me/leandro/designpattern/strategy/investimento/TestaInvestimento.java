package me.leandro.designpattern.strategy.investimento;

public class TestaInvestimento {

	public static void main(String[] args) {
		Conta conta = new Conta(100000.0);
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realizarInvestimento(conta, new Arrojado());
	}
}
