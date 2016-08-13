package me.leandro.designpattern.chainofresponsability.serializacao;

import java.util.Objects;

public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		Objects.requireNonNull(formato);
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}

}
