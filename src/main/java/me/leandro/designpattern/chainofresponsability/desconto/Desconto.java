package me.leandro.designpattern.chainofresponsability.desconto;

public interface Desconto {

	double deconta(Orcamento orcamento);

	void setProximo(Desconto proximo);

}
