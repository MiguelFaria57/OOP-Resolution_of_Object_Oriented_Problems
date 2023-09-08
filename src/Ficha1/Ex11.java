import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // não percebi o enunciado
        /*
        int limi, lims;
        System.out.print("Indique um limite mínimo: ");
        Scanner sc = new Scanner(System.in);
        limi = sc.nextInt();
        System.out.print("Indique um limite máximo: ");
        sc = new Scanner(System.in);
        lims = sc.nextInt();
        */

        int n, m;
        System.out.print("Indique um número n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Indique um número m: ");
        sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.printf("O mmc de %d e %d é %d.", n, m, mmc(n,m));
    }

    public static int mmc(int n, int m) {
        int a, b;
        if (n < m) {
            a = n;
            b = m;
        }
        else {
            a = m;
            b = n;
        }
        int i;
        for(i=1; i<=b; i++) {
            if(i*a % b == 0)
                break;
        }

        return i*a;
    }
}
