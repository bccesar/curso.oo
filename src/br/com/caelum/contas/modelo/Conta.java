package br.com.caelum.contas.modelo;

/**
 * Classe que representa as Contas do sistema
 * 
 * @author oo7162
 *
 */
public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;

	public Conta() {

	}

	public Conta(String titular) {
		super();
		this.titular = titular;
	}

	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	
	public String getTipo() {
		return "Conta";

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * 
	 * @return O saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

}
