package br.com.caelum.funcionario.modelo;

public class Secretario extends Funcionario{ 
	
	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public double getBonificacao() {
		return getSalario() * 0.10 + 500;
	}
	
	
}
