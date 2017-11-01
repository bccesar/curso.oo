package br.com.caelum.aula02;

class Conta{
        private int agencia;
        private int conta;
        private String nome;
        private Data dataAbertura;
        private double saldo;
        private static int identificador;
        private int identificadorLocal;

        public Conta(){
            this.dataAbertura = new Data();
            this.identificador++;
            this.identificadorLocal = this.identificador;
        }

        public Conta(String nome){
            this.nome = nome;
            this.dataAbertura = new Data();
            this.identificador++;
            this.identificadorLocal = this.identificador;
        }

        public static int getIdentificador(){
            return identificador;
        }

        public int getIdentificadorLocal(){
            return identificadorLocal;
        }


        public void setAgencia(int agencia){
            this.agencia = agencia;
        }

        public void setConta(int conta){
            this.conta = conta;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getNome(){
            return nome;
        }

        public void setDataAbertura(Data dataAbertura){
            this.dataAbertura = dataAbertura;
        }

        public double getSaldo(){
            return saldo;
        }

        public boolean saca(double valor){
            if(saldo >= valor){
                saldo = saldo - valor;
                return true;
            }else{
                return false;
            }
        }

        public void deposita(double valor){
            saldo = saldo + valor;
        }

        public double calculaRendimento(){
            return saldo * 0.1;
        }

        public String recuperaDadosParaImpressao(){
            String r = "";
            r+= "Nome = " + nome + "\n";
            r+= "Agencia = " + agencia + "\n";
            r+= "Conta = " + conta + "\n";
            r+= "Data Abertura = " + dataAbertura.dia + "/" + dataAbertura.mes + "/" + dataAbertura.ano + "\n";
            r+= "Saldo = " + saldo + "\n";
            r+= "Identificador = " + identificador;

            return r;
        }

}
