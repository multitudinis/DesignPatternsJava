package br.com.lucas.loja.orcamento;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.situacao.EmAnalise;
import br.com.lucas.loja.orcamento.situacao.situacaoOrcamento;

public class orcamento {
	private BigDecimal valor;
	private int quantidadeDeItens;
	private situacaoOrcamento situacao;
	
	public orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDesconto(this);
		this.valor =  this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.aprovar(this);
	}
		
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	public situacaoOrcamento getSituacao() {
		return situacao;
	}
	public void setSituacao(situacaoOrcamento situacao) {
		this.situacao = situacao;
	}
}
