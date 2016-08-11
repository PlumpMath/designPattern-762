package me.leandro.designpattern.strategy.investimento;

public class RealizadorDeInvestimentos {

	public void realizarInvestimento(Conta conta, Investimento investimento) {
		double investimentoBruto = investimento.investir(conta);
		double imposto = investimentoBruto * 0.25;
		double novoSaldo = investimentoBruto - imposto;

		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.deposita(novoSaldo);
		System.out.println("Lucro total do investimento: " + investimentoBruto);
		System.out.println("Impostos: " + imposto);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}

}
