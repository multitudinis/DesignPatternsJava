package br.com.lucas.loja.orcamento;

import java.math.BigDecimal;

public class orcamento {
	private BigDecimal valor;
	
	public orcamento(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}
}
