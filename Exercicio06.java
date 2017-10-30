class Exercicio06{
    public static void main(String[] args) {
        long n1 = 1;
        long n2 = 0;
        long f = 1;
        while (f < 100) {


                System.out.println(f);
                f = n1 + n2;
                n2 = n1;
                n1 = f;


        }
    }
}
