package br.com.caelum.funcionario.modelo;

public class Gerente extends Funcionario {

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
		return super.getBonificacao() + 3000;
	}
}
