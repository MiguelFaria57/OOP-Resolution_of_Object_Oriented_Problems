import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.print("Indique um número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == inverte(num))
            System.out.printf("O número %d é uma capicua.", num);
        else
            System.out.printf("O número %d não é uma capicua.", num);
    }

    public static int inverte(int num) {
        int invertido=0;
        while(num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return invertido;
    }
}
