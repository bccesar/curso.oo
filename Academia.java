class Academia{

    public static void main(String[] args) {
        String nome = "Bruno Cesar Gonçalves";
        int idade = 34;
        double altura = 1.85;
        float peso = 98f;
        char sexo = 'M';
        boolean ehFumante = false;
        boolean ehAmigo = true;

        if(idade >= 18 || ehAmigo ){
            System.out.println("Pode se matricular");
        }else{
            System.out.println("NÃO pode se matricular");
        }

        for (int i = 1; i <= 3 ;i++ ) {
            if (i == 2) {
                continue;
            }
            peso++;
        }

    }

}
