package br.com.lucas.loja.imposto;

import java.math.BigDecimal;

import br.com.lucas.loja.orcamento.orcamento;

public class calculadoraDeImpostos {
	public BigDecimal calcular(orcamento Orcamento, imposto Imposto) {
		return Imposto.calcular(Orcamento);
		}
	}