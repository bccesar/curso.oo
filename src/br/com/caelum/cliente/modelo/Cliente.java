package br.com.caelum.cliente.modelo;

import br.com.caelum.autenticacao.Autenticavel;

public class Cliente implements Autenticavel {

	public String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(String senha){
		if(this.senha == senha){
			return true;
		}else{
			return false;
		}
	}

}
