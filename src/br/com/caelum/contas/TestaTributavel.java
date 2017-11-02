package br.com.caelum.contas;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		System.out.println(cc.getSaldo());
		
		SeguroDeVida sv = new SeguroDeVida();
		sv.setValor(100);
		System.out.println(sv.getValorImposto());
		System.out.println(sv.getValor());
		
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
		//System.out.println(t.getSaldo());
		
		Tributavel x = sv;
		System.out.println(x.getValorImposto());
		//System.out.println(x.getSaldo());
	}
}
