package me.leandro.designpattern.chainofresponsability.serializacao;

import me.leandro.designpattern.chainofresponsability.serializacao.Conta;

public class RespostaXML implements Resposta {

	private Resposta resposta;

	public RespostaXML(Resposta resposta) {
		this.resposta = resposta;
	}

	public RespostaXML() {
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato().equals(Formato.XML)) {
			System.out.println("<conta><titular>" + conta.getNome() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else if (resposta != null) {
			resposta.responde(requisicao, conta);
		} else {
			throw new RuntimeException("Formato de resposta não encontado");
		}
	}

}
