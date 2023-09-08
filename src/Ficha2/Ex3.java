public class Ex3 {
    public static void main(String[] args) {
        int[][] tabela1 = {{1,2,3},{4,5,6},{7,8,9}}, tabela2 = {{10,20,30},{40,50,60},{70,80,90}};
        int[][] matriz = new int[tabela1.length][tabela2[0].length];

        produtoMatrizes(tabela1, tabela2, matriz);
        printMatriz(matriz);
    }

    public static void produtoMatrizes(int[][] tab1, int[][] tab2, int[][] matriz) {
        if (tab1[0].length != tab2.length)
            System.out.print("Não é possível efetuar a multiplicação.");
        else {
            int i, j;
            for (i=0; i<matriz.length; i++) {
                for (j=0; j<matriz[i].length; j++) {
                    matriz[i][j] = produto(tab1, tab2, i, j);
                }
            }
        }
    }

    public static int produto(int[][] tab1, int[][] tab2, int i, int j) {
        int produto = 0;
        int aux = 0;
        for (int a=0; a<tab1[0].length; a++) {
            produto += tab1[i][aux]*tab2[aux][j];
            aux++;
        }

        return produto;
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
