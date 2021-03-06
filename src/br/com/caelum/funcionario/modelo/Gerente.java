package br.com.caelum.funcionario.modelo;

import br.com.caelum.autenticacao.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{

	public String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentica(String senha){
		if(this.senha == senha){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public double getBonificacao(){
		return getSalario() * 0.10 + 3000;
	}
}
