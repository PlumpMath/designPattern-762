package me.leandro.designpattern.strategy.primeiro;

import java.util.Arrays;
import java.util.List;

public class TestaCalculoImposto {

	public static void main(String[] args) {
		List<Imposto> impostos = Arrays.asList(new ICMS(), new ISS());

		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		impostos.forEach(imposto -> {
			calculadorDeImposto.realizaCalculo(orcamento, imposto);
		});
	}
}
