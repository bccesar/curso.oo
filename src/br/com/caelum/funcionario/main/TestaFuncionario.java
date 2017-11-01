package br.com.caelum.funcionario.main;

import br.com.caelum.funcionario.modelo.ControleDeBonificacao;
import br.com.caelum.funcionario.modelo.Funcionario;
import br.com.caelum.funcionario.modelo.Gerente;
import br.com.caelum.funcionario.modelo.Secretario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		f.setNome("Joao");
		f.setSalario(1000);
		
		Gerente g = new Gerente();
		g.setNome("Zeca");
		g.setSalario(1000);
		g.setSenha("123");
		
		
		Secretario s = new Secretario();
		s.setNome("Ana");
		s.setTelefone("32217895");
		s.setSalario(1000);
		
		
		ControleDeBonificacao cb = new ControleDeBonificacao();
		cb.adiciona(f);
		cb.adiciona(g);
		cb.adiciona(s);
		System.out.println(cb.getTotal());
		
		
		
		
		
		
	}

}
