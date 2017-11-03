package br.com.caelum.contas.modelo;

import br.com.caelum.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo(){
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		if(valor < 0 ){
			throw new IllegalArgumentException("Valor negativo não permitido");
		}
		if(this.getSaldo() < valor){
			throw new SaldoInsuficienteException(valor);
		}
		super.saca(valor);
		super.saca(0.10);
	}

	@Override
	public double getValorImposto() {

		return getSaldo() * 0.01;
	}

	
}
