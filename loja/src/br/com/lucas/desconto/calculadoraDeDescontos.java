package br.com.lucas.desconto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class calculadoraDeDescontos {
	public BigDecimal calcular(orcamento Orcamento) {
		desconto cadeiaDeDescontos  =  new descontoMaisDeCinco(
				new descontoMaisDeQuinhentos(new semDesconto()));
		
		return cadeiaDeDescontos.calcular(Orcamento);
	}
}
