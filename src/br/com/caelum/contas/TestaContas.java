package br.com.caelum.contas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {

		/*
		//TelaDeContas.main(args);
		//SistemaBancario.mostraTela(true);
		*/
		
		
		ContaCorrente ana = new ContaCorrente();
		ana.setTitular("Ana");
		ana.deposita(500);
		ana.setAgencia("7432");
			
		
		ContaCorrente ana2 = new ContaCorrente();
		ana2.setTitular("Ana");
		ana2.deposita(500);
		ana2.setAgencia("7432");
			
		
		if(ana.equals(ana2)){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
		

		System.out.println(ana);
		
		System.out.println(ana2);
		
		
		
		
		String c1 = new String("brounoo");
		String c2 = new String("bruno");
		
		System.out.println(c1.equals(c2));
		
		
		
		System.out.println(c1.replace('o', 'a'));
		

		System.out.println(c1.length());
		
		
		//detectou q rescreveu o toString na classe testada pq ele sai diferente do q seria de object
		Throwable t = new Throwable();
		System.out.println(t.toString());
		
		//exercicios pg176
		//3
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
		//4
		String teste = " Bruno ";
		System.out.println(teste.contains("uno"));
		System.out.println(teste);
		System.out.println("[" + teste.trim() + "]");
		System.out.println(teste.isEmpty());
		System.out.println(teste.length());
		
		escreveEmLinhas("bruno");
		escreveInvertido("anotaram a data da maratona");
		somaIdades();
		testaArrays();
		testaArrayList();
		testaLinkedList();
		testaHashSet();
		testaMap();
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void testaMap() {

		Map<String, Conta> t = new HashMap<>();
		Conta c1 = new Conta() {
			
			@Override
			public String getTipo() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		t.put("ana", c1);
		
		
	}

	private static void testaHashSet() {
		Conta c;
		HashSet<Conta> contas = new HashSet<>();
		c = new ContaCorrente();
		c.setTitular("Bruno");
		contas.add(c);
		
		c = new ContaCorrente();
		c.setTitular("Bruna");
		contas.add(c);
		
		System.out.println("contas.size() = " + contas.size());
		//?? ver pq nao funcionou
		
		
	}

	private static void testaLinkedList() {
		
		ContaCorrente c1 = new ContaCorrente();
		
			
		LinkedList<ContaCorrente> contas = new LinkedList<>();
		contas.add(c1);
		
		Conta c = contas.get(0);		
		
		//nota-se q ArrayList e Linkedlist tem a mesma interface
		
		
	}

	private static void testaArrayList() {

		ContaCorrente c1 = new ContaCorrente();
		
		ArrayList contas = new ArrayList();
		contas.add(c1);
		contas.add("teste");
		
		
		ArrayList<ContaCorrente> contas2 = new ArrayList<>();
		contas2.add(c1);
		//contas2.add("teste"); nesse caso nao pode, pq fomos explicitos na declaracao
		
		Conta conta1 = (Conta)contas.get(0); //aqui precisa dar cast pq contas é generico(ArrayList)
		Conta conta2 = contas2.get(0);		//aqui vai direto pq é especifico(ArrayList<ContaCorrente> )
		
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Bruno");
		nomes.add("Bruna");
		nomes.add("AJoao");
		Collections.sort(nomes);
		System.out.println(nomes);
		System.out.println("Bruno".toUpperCase());
		
		
		
		
	}

	private static void testaArrays() {

		Conta[] c = new Conta[2];
		c[0] = new ContaCorrente();
		c[0].setTitular("Bruno");
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setTitular("Bruno");
		c[1] = cp;
		
		//da da mesma os dois casos acima
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].toString());
		}
		
		
		
	}

	private static void somaIdades() {

		int[] idades = new int[10];
		int soma = 0;
		Random r = new Random();
		

		System.out.println();
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = r.nextInt(10);
			soma += idades[i];
			System.out.print(" + " + idades[i]);
		}
		System.out.println();
		System.out.println("Total = " + soma);
		System.out.println("Media = " + soma / idades.length);
	}

	
	
	private static void escreveInvertido(String s) {
		
		for (int i = s.length()-1; i >= 0 ; i--) {
			
			System.out.print(s.charAt(i));
		}
		
	}

	private static void escreveEmLinhas(String s) {

		for (int i = 0; i <= s.length()-1; i++) {
			
			System.out.println(s.charAt(i));
		}
		
	}

}
