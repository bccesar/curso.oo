package br.com.caelum.exception;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de R$ " + valor);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




}
