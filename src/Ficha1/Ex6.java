import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num=0;

        while (num<=3) {
            System.out.print("Escreva um número maior que 3: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }

        if (num == Ex6.SomaDivisores(num)) {
            System.out.printf("Número Perfeito: %d\n", num);
            System.out.print("Fatores: ");
            for (int i=1; i<num; i++) {
                if ((num % i) == 0) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }

    public static int SomaDivisores(int num) {
        int soma=0;
        for (int i=1; i<num; i++) {
            if ((num % i) == 0) {
                soma += i;
            }
        }

        return soma;
    }
}
