import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int limite;
        int soma = 0;
        System.out.print("Indique um limite: ");
        Scanner sc = new Scanner(System.in);
        limite = sc.nextInt();

        int aux=0;
        int x=1;
        while (soma <= limite) {
            aux += 1;
            soma += aux;
        }

        System.out.printf("A soma dá %d e o último número foi %d", soma, aux);
    }
}
