 package br.com.lucas.loja;

 import java.math.BigDecimal;

import br.com.lucas.loja.imposto.ICMS;
import br.com.lucas.loja.imposto.calculadoraDeImpostos;
import br.com.lucas.loja.orcamento.orcamento;

 public class testesImposto {

 	public static void main(String[] args) {
 		orcamento Orcamento = new orcamento(new BigDecimal("100"), 1);
 		calculadoraDeImpostos Calculadora = new calculadoraDeImpostos();
 		System.out.println(Calculadora.calcular(Orcamento, new ICMS()));
 	}
 }