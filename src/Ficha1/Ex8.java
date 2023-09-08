import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int n;
        System.out.print("Indique um número n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        for (i= (int)Math.pow(10, n-1); i<(int)Math.pow(10, n); i++) {
            if (i == (Math.pow(i, 2) % Math.pow(10, n)))
                System.out.printf("%d ", i);
        }
    }
}
