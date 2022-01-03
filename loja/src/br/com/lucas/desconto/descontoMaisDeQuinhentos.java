package br.com.lucas.desconto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class descontoMaisDeQuinhentos extends desconto {
	public descontoMaisDeQuinhentos(desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(orcamento Orcamento) {
		return Orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(orcamento Orcamento) {
		return Orcamento.getValor().compareTo(new BigDecimal("500"))>0;
	}
}
