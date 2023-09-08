import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int num = 0;
        while (num<=0 || num>=100) {
            System.out.print("Indique um número: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }
        System.out.print("Os 4 menores múltiplos são: ");
        int i;
        int count = 0;
        for (i = 0; i < 100; i++) {
            if (count>=4)
                break;
            if (i % num == 0) {
                System.out.printf("%d ", i);
                count++;
            }
        }
    }
}
