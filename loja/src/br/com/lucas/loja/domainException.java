package br.com.lucas.loja;

public class domainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public domainException(String mensagem) {
		super(mensagem);
	}
}
