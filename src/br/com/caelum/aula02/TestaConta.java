package br.com.caelum.aula02;

class TestaConta{
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNome("Bruno");
        c1.setAgencia(7432);
        c1.setConta(3585);
        c1.deposita(5000);
        Data dataAbertura = new Data();
        dataAbertura.dia = 01;
        dataAbertura.mes = 04;
        dataAbertura.ano = 2001;
        c1.setDataAbertura(dataAbertura);

        c1.deposita(250);
        System.out.println("Saldo atual: " +  c1.getSaldo());
        System.out.println("Rendimento Mensal: " +  c1.calculaRendimento());

        c1.saca(100);
        System.out.println("Saldo atual: " +  c1.getSaldo());
        System.out.println("Rendimento Mensal: " +  c1.calculaRendimento());

        System.out.println(c1.recuperaDadosParaImpressao());

        Conta c2 = new Conta();
        c2 = c1;
        c2.setNome("Bruno Gonçalves");
        System.out.println(c1.getNome() + "/" + c2.getNome());
        System.out.println("identificador do c2 = " + c2.getIdentificador());

        Conta c3 = new Conta("Mary");
        System.out.println(c3.recuperaDadosParaImpressao());
        System.out.println("identificador do c1 = " + c1.getIdentificador());
        System.out.println("identificador do c2 = " + c2.getIdentificador());
        System.out.println("identificador do c3 = " + c3.getIdentificador());
        System.out.println("identificador da classe Conta = " + Conta.getIdentificador());

        System.out.println("identificadorLocal do c1 = " + c1.getIdentificadorLocal());
        System.out.println("identificadorLocal do c2 = " + c2.getIdentificadorLocal());
        System.out.println("identificadorLocal do c3 = " + c3.getIdentificadorLocal());
    }
}
