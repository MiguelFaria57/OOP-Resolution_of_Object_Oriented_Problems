import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        System.out.print("Indique um número N para a matriz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrizInicial = criaMatrizInicial(n);
        int[][] matrizFinal = criaMatrizFinal(matrizInicial);

        System.out.print("Matriz Inicial\n");
        printMatriz(matrizInicial);
        System.out.print("Matriz Final\n");
        printMatriz(matrizFinal);
    }

    public static int[][] criaMatrizInicial(int n) {
        int max = 100;
        int[][] tab = new int[n][n];
        for (int i=0; i<tab.length; i++) {
            for (int j=0; j<tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * max);
            }
        }

        return tab;
    }

    public static int[][] criaMatrizFinal(int[][] matriz) {
        int[][] tab = new int[matriz.length][matriz[0].length];
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                tab[i][j] = media(matriz, i, j);
            }
        }

        return tab;
    }

    public static int media(int[][] matriz, int i, int j) {
        int soma=0, counter=0;
        int media;
        for (int a1=i; a1<matriz.length; a1++) {
            if (a1==i)
                for (int a2=j; a2<matriz[a1].length; a2++) {
                    soma += matriz[a1][a2];
                    counter++;
                }
            else
                for (int a2=0; a2<matriz[a1].length; a2++) {
                    soma += matriz[a1][a2];
                    counter++;
                }
        }
        soma += -matriz[i][j];
        counter += -1;
        if (counter == 0)
            media = 0;
        else
            media = soma/counter;

        return media;
    }

    public static void printMatriz(int[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-5d", matriz[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
