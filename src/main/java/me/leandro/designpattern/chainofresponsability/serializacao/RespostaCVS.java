package me.leandro.designpattern.chainofresponsability.serializacao;

public class RespostaCVS implements Resposta {

	private Resposta resposta;

	public RespostaCVS(Resposta resposta) {
		this.resposta = resposta;
	}

	public RespostaCVS() {
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato().equals(Formato.CVS)) {
			System.out.println(conta.getNome() + ";" + conta.getSaldo());
		} else if (resposta != null) {
			resposta.responde(requisicao, conta);
		} else {
			throw new RuntimeException("Formato de resposta não encontado");
		}
	}

}
