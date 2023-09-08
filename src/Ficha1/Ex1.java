import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n, k, combinacao;
        int n1, k1, c1;
        System.out.printf("Escreva o número de elementos: ");
        Scanner sc1 = new Scanner(System.in);
        n = sc1.nextInt();
        System.out.printf("Pretende combinar quantos a quantos: ");
        Scanner sc2 = new Scanner(System.in);
        k = sc2.nextInt();
        int a = n, b = k, c = n - k;
        n1 = Ex1.fatorial(a);
        k1 = Ex1.fatorial(b);
        c1 = Ex1.fatorial(c);
        combinacao = n1 / (k1 * c1);
        System.out.printf("Combinação de %d elementos, tomados %d a %d: %d\n", n, k, k, combinacao);
    }

    public static int fatorial(int numBase) {
        int x = 1;
        while (numBase != 0) {
            x = x*numBase;
            numBase += -1;
        }
        return x;
    }
}

