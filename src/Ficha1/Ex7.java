public class Ex7 {
    public static void main(String[] args) {
        for (int i=100; i<1000; i++) {
            int a, b, c, soma;
            a = i/100;
            b = (i%100)/10;
            c = (i%100)%10;

            soma = (int)Math.pow(a,3) + (int)Math.pow(b,3) + (int)Math.pow(c,3);
            if (soma == i) {
                System.out.printf("O número %d possui a propriedade.\n", i);
            }

        }
    }
}
