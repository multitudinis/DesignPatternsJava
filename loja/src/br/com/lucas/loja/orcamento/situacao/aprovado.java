package br.com.lucas.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class aprovado extends situacaoOrcamento{
	public BigDecimal calcularValorDeDescontoExtra(orcamento Orcamento) {
		return Orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void finalizar(orcamento Orcamento) {
		Orcamento.setSituacao(new finalizado());
	}
}
