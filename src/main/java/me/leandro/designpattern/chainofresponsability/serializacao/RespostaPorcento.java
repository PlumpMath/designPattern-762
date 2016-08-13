package me.leandro.designpattern.chainofresponsability.serializacao;

public class RespostaPorcento implements Resposta {

	private Resposta resposta;

	public RespostaPorcento(Resposta resposta) {
		this.resposta = resposta;
	}

	public RespostaPorcento() {
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato().equals(Formato.PORCENTO)) {
			System.out.println(conta.getNome() + "%" + conta.getSaldo());
		} else if (resposta != null) {
			resposta.responde(requisicao, conta);
		} else {
			throw new RuntimeException("Formato de resposta não encontado");
		}
	}
}
