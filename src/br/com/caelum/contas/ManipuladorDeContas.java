package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	
	public void criaConta(Evento evento){
		
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if(tipo.equals("Conta Corrente")){
			conta = new ContaCorrente();
		}else if(tipo.equals("Conta Poupança")){
			conta = new ContaPoupanca();	
		}
		
		conta.setTitular(evento.getString("titular"));
		conta.setAgencia(evento.getString("agencia"));
		conta.setNumero(evento.getInt("numero"));
		
	}
	
	public void saca(Evento evento){
		
		double valor = evento.getDouble("valorOperacao");
		try {
			conta.saca(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void deposita(Evento evento){
		
		double valor = evento.getDouble("valorOperacao");
		conta.deposita(valor);
		
	}
	
	public void transfere(Evento evento){
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	

}
