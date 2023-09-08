import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];
        int i, j;
        for (i=0; i<sudoku.length; i++) {
            for (j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = 0;
            }
        }
        criaSudoku(sudoku);
        printMatriz(sudoku);
    }

    public static void criaSudoku(int[][] matriz) {
        int i, j;
        Random rand = new Random();
        int random;
        for (i=0; i<matriz.length; i++) {
            for (j=0; j<matriz[i].length; j++) {
                random = rand.nextInt(10);
                if (random != 0) {
                    while (verificar(matriz, i, j, random) != 1) {
                        random = rand.nextInt(10);
                    }
                }
                matriz[i][j] = random;
            }
        }
    }

    public static int verificar(int[][] matriz, int i, int j, int random) {
        int a;
        int confirmacao = 1;
        for (a=0; a<matriz[i].length; a++) {
            if (random == matriz[i][a]) {
                confirmacao = 0;
                break;
            }
        }
        for (a=0; a<matriz.length; a++) {
            if (random == matriz[a][j]) {
                confirmacao = 0;
                break;
            }
        }

        return confirmacao;
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
