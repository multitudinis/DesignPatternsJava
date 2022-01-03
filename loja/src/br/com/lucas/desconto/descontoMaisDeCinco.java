package br.com.lucas.desconto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class descontoMaisDeCinco extends desconto{
	public descontoMaisDeCinco(desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(orcamento Orcamento) {		
		return Orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(orcamento Orcamento) {
		return Orcamento.getQuantidadeDeItens()>5;
	}
}
