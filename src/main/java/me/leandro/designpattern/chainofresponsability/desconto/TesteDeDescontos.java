package me.leandro.designpattern.chainofresponsability.desconto;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();

		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("caneta", 250.0));
		orcamento.adicionaItem(new Item("lapis", 250.0));

		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
