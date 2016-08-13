package me.leandro.designpattern.chainofresponsability.serializacao;

public class TestaResposta {

	public static void main(String[] args) {
		Requisicao requisicao = new Requisicao(null);
		Conta conta = new Conta("Leandro", 300.0);

		Responde responde = new Responde();
		responde.noFormato(requisicao, conta);

	}
}
