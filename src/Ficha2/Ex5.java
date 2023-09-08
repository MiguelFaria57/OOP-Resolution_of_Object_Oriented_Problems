public class Ex5 {
    public static void main(String[] args) {
        printMatriz(alineaA());
        printMatriz(alineaB());
        printMatriz(alineaC());
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

    public static int[][] alineaA() {
        int max = 100;
        int[][] tab = new int[5][10];
        for (int i=0; i<tab.length; i++) {
            for (int j=0; j<tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * max);
            }
        }

        return tab;
    }

    public static int[][] alineaB() {
        int aux=0;
        int[][] tab = new int[5][10];
        for (int i=0; i<tab.length; i++) {
            for (int j=0; j<tab[i].length; j++) {
                tab[i][j] = (j + aux);
            }
            aux += 10;
        }

        return tab;
    }

    public static int[][] alineaC() {
        int[][] tab = new int[5][10];
        for (int i=0; i<tab.length; i++) {
            for (int j=0; j<tab[i].length; j++) {
                tab[i][j] = i+ j*5;
            }
        }

        return tab;
    }
}
