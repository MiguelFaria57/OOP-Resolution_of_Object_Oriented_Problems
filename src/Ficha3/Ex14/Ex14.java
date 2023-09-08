import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.print("Indique uma frase: ");
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        System.out.print("Indique uma palavra: ");
        sc = new Scanner(System.in);
        String p = sc.nextLine();

        System.out.printf("A palavra '%s' aparece %d vezes na frase.", p, contaVezes(f, p));
    }

    public static int contaVezes(String f, String p) {
        int count = 0;
        String[] palavras = f.split(" ");
        for (int i=0; i<palavras.length; i++) {
            if (p.equals(palavras[i])) {
                count++;
            }
        }

        return count;
    }
}