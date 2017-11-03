package br.com.caelum.contas.modelo;

import br.com.caelum.exception.SaldoInsuficienteException;

/**
 * Classe que representa as Contas do sistema
 * 
 * @author oo7162
 *
 */
public abstract class Conta implements Comparable<Conta> {

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
		try {
			this.saca(valor);
			conta.deposita(valor);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public abstract String getTipo();

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
		if(valor < 0){
			throw new IllegalArgumentException("Valor negativo não permitido");
		}
		this.saldo = this.saldo + valor;

	}

	public void saca(double valor) {
		
		if(valor < 0 ){
			throw new IllegalArgumentException("Valor negativo não permitido");
		}
		
		if(this.saldo < valor){
			throw new SaldoInsuficienteException(valor);
		}
		
		this.saldo = this.saldo - valor;
	}
	
    public String recuperaDadosParaImpressao(){
        String r = "";
        r+= "Nome = " + titular + "\n";
        r+= "Agencia = " + agencia + "\n";
        r+= "Conta = " + numero + "\n";
        r+= "Data Abertura = " + dataAbertura + "\n";
        r+= "Saldo = R$ " + saldo + "\n";
        r+= "Tipo = " + getTipo();

        return r;
    }

	@Override
	public String toString() {
		return "Conta [titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Conta c) {
		//baseado no seu criterio de comparacao
		//pode ser qualquer atriuto que vc escolher, saldo, nome, data
		//se maior deve trazer positivo
		//se menor deve trazer negativo
		//se igual deve trazer 0
		//ex: usando o saldo
		//isso vai ser usado pelo Colletion.sort para ordenar

		if(this.saldo < c.saldo){
			return -1;
		}
		if(this.saldo > c.saldo){
			return 1;
		}
		return 0;
	}
    

}
