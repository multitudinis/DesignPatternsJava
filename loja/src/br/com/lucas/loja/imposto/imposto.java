package br.com.lucas.loja.imposto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public interface imposto {
	BigDecimal calcular(orcamento Orcamento);
}
