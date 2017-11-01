package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

/**
 * Classe que testa a classe Contas
 * @author oo7162
 *
 */
public class TestaConta {
	public static void main(String[] args) {
	
		Conta c = new Conta();
		c.setAgencia("7432");
		c.setDataAbertura("01/02/2001");
		c.setTitular("Bruno");
		c.setNumero(3585);
		c.deposita(500.5);
		c.saca(22.30);
		
		System.out.println("Titular = " + c.getTitular());
		
	}
}
