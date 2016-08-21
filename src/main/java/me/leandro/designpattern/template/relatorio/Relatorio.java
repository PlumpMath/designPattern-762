package me.leandro.designpattern.template.relatorio;

import java.util.List;

public interface Relatorio {

	void gerarRelatorio(List<Conta> contas);
}
