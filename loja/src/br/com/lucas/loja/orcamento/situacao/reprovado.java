package br.com.lucas.loja.orcamento.situacao;

import br.com.lucas.loja.orcamento.orcamento;

public class reprovado extends situacaoOrcamento{
	public void finalizar(orcamento Orcamento) {
		Orcamento.setSituacao(new finalizado());
	}
}
