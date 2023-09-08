import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int num=0;
        while (num<=0) {
            System.out.print("Indique um limite: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }
        System.out.print("Números primos: ");
        for (int i=1; i<=num; i++) {
            if (Ex9.ePrimo(i) == 1)
                System.out.printf("%d ", i);
        }
    }

    public static int ePrimo(int num) {
        int soma=1;
        for (int i=2; i<num; i++) {
            if ((num % i) == 0) {
                soma += i;
            }
        }
        if (soma == 1)
            return 1;
        else
            return 0;

        /*
        int counter=2,teste=-1;
        while(counter<num){
            if(num % counter== 0){
                teste = 0;
            }
        counter++;
        }
        if (teste != 0)
            teste = 1;
        return teste;
         */
    }
}
