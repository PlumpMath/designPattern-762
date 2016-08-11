package me.leandro.designpattern.strategy.primeiro;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
