package br.com.lucas.loja.imposto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class ICMS implements imposto {
	public BigDecimal calcular(orcamento Orcamento) {
		return Orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
