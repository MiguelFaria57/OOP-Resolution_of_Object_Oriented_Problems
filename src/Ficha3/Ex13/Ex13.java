import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.print("Indique uma frase: ");
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        System.out.print("Indique uma palavra: ");
        sc = new Scanner(System.in);
        String p = sc.nextLine();

        System.out.printf("A palavra %s aparece %d vezes na frase.", p, contaVezes(f, p));
    }

    public static int contaVezes(String f, String p) {
        int count = 0;
        int i;

        return count;
    }
}
