package br.com.lucas.desconto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public abstract class desconto {
	protected desconto proximo;
	
	public desconto(desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(orcamento Orcamento) {
		if (deveAplicar(Orcamento)) {
			return efetuarCalculo(Orcamento);
		}
		return proximo.calcular(Orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(orcamento Orcamento);
	public abstract boolean deveAplicar(orcamento Orcamento);
}
