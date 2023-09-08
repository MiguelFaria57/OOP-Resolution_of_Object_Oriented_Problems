import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Indique um limite máximo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(Arrays.toString(peneira(n)));
    }

    public static int[] peneira(int limite) {
        int i, j;
        int count1 = 0, count2 = 0;
        int[] peneira = new int[limite-1];
        for (i=2; i<=limite; i++) {
            peneira[(i-2)] = i;
        }
        for (i=0; i<peneira.length; i++) {
            if (peneira[i] != 0)
                count1++;
                for (j=i; j<peneira.length; j++) {
                    if (peneira[i] != 0)
                        if (((peneira[j]%peneira[i]) == 0) && (peneira[j] != peneira[i]))
                            peneira[j] = 0;
            }
        }

        int[] primos = new int[count1];
        for (i=0; i< peneira.length; i++) {
            if (peneira[i] != 0) {
                primos[count2] = peneira[i];
                count2++;
            }
        }

        return primos;
    }
}
