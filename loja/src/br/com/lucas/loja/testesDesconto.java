 package br.com.lucas.loja;

 import java.math.BigDecimal;

import br.com.lucas.desconto.calculadoraDeDescontos;
import br.com.lucas.loja.orcamento.orcamento;

 public class testesDesconto {

 	public static void main(String[] args) {
 		orcamento Orcamento = new orcamento(new BigDecimal("700"), 6);
 		
 		calculadoraDeDescontos Calculadora = new calculadoraDeDescontos();
 		System.out.println(Calculadora.calcular(Orcamento));
 	}
 }