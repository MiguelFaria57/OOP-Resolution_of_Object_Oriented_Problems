import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int num1, num2;
        int soma1, soma2;

        System.out.print("Escreva o primeiro número: ");
        Scanner sc1 = new Scanner(System.in);
        num1 = sc1.nextInt();
        System.out.print("Escreva o segundo número: ");
        Scanner sc2 = new Scanner(System.in);
        num2 = sc2.nextInt();

        soma1 = Ex5.SomaDivisores(num1);
        soma2 = Ex5.SomaDivisores(num2);
        if (soma1 == soma2)
            System.out.print("Os números são amigos");
        else
            System.out.print("Os números não são amigos");
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
