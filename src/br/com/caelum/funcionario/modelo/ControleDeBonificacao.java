package br.com.caelum.funcionario.modelo;

public class ControleDeBonificacao {

	private double total;
	
	public void adiciona(Funcionario f){
		total += f.getBonificacao();
	}

	public double getTotal() {
		return total;
	}

	
	
}
