package br.com.lucas.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.lucas.loja.domainException;
import br.com.lucas.loja.orcamento.orcamento;

public abstract class situacaoOrcamento {
	public BigDecimal calcularValorDesconto(orcamento Orcamento) {
		return BigDecimal.ZERO;
	}
	public void aprovar(orcamento Orcamento) {
		throw new domainException("Orçamento não pode ser aprovado");
	}
	
	public void reprovar(orcamento Orcamento) {
		throw new domainException("Orçamento não pode ser reprovado");
	}
	
	public void finalizar(orcamento Orcamento) {
		throw new domainException("Orçamento não pode ser finalizado");
	}
}
