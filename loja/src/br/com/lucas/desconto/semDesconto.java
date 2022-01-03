package br.com.lucas.desconto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class semDesconto extends desconto{
	public semDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(orcamento Orcamento) {		
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(orcamento Orcamento) {
		return true;
	}
}
