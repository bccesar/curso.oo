
public class ContaNovo {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	
	public ContaNovo() {
		
	}
	
	
	public ContaNovo(String titular) {
		super();
		this.titular = titular;
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
		if (this.saldo >= valor) {
			this.saldo =- valor;
		}
	}
	
}
