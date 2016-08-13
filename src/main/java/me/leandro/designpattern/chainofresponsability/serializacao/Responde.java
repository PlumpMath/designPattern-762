package me.leandro.designpattern.chainofresponsability.serializacao;

public class Responde {

	public void noFormato(Requisicao requisicao, Conta conta) {
		Resposta resposta = new RespostaPorcento(new RespostaCVS(new RespostaXML()));
		resposta.responde(requisicao, conta);
	}
}
