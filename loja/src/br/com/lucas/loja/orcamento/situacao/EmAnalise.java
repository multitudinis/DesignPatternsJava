package br.com.lucas.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.lucas.loja.domainException;
import br.com.lucas.loja.orcamento.orcamento;

public class EmAnalise extends situacaoOrcamento{
	public BigDecimal calcularValorDeDescontoExtra(orcamento Orcamento) {
		return Orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	public void aprovar(orcamento Orcamento) {
		Orcamento.setSituacao(new aprovado());
	}
	
	public void reprovar(orcamento Orcamento) {
		Orcamento.setSituacao(new reprovado());
	}
}
