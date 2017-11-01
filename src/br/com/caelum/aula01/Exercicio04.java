package br.com.caelum.aula01;

class Exercicio04 {
    public static void main(String[] args) {
        long r = 1;
        for (int i = 1; i<=40 ;i++ ) {
            r = r * i;
            System.out.println("O fatorial de " + i + " (" + i + "!)    é   " + r);
        }
    }

}
