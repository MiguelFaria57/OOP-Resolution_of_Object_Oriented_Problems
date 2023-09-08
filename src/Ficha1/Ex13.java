import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int numVerificar = 0;
        while (numVerificar<1 || numVerificar>99) {
            System.out.print("Indique um número: ");
            Scanner sc = new Scanner(System.in);
            numVerificar = sc.nextInt();
        }
        for (int i=0; i<1000;  i++) {
            if (verificaContido(i, numVerificar) == 1)
                System.out.println(i);
        }
    }

    public static int verificaContido(int num, int numVerificar) {
        int contido = 0;
        if (numVerificar < 10) {
            while(num != 0) {
                int digito = num % 10;
                num /= 10;
                if (digito == numVerificar) {
                    contido = 1;
                    break;
                }
            }
        }
        else {
            while(num != 0) {
                int digitos = num % 100;
                num /= 10;
                if (digitos == numVerificar) {
                    contido = 1;
                    break;
                }
            }
        }

        return contido;
    }
}
