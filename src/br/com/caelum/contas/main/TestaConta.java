package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.exception.SaldoInsuficienteException;

/**
 * Classe que testa a classe Contas
 * @author oo7162
 *
 */
public class TestaConta {
	public static void main(String[] args) {
	
		Conta c = new ContaCorrente();
		c.setAgencia("7432");
		c.setDataAbertura("01/02/2001");
		c.setTitular("Bruno");
		c.setNumero(3585);
		c.deposita(500.5);
		try {
			c.saca(-501);
			System.out.println("sacou ok");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Titular = " + c.getTitular());
		
	}
}
