public class Ex2 {
    public static void main(String[] args) {
        int[] tabela1 = {1,2,3,4,5}, tabela2 = {10,20,30,40,50};
        int[] tabela = juntaTabelas(tabela1, tabela2);

        for (int j : tabela) {  //for (int j=0; j<tabela.length; j++)
            System.out.printf("%d ", j);
        }
    }

    public static int[] juntaTabelas(int[] tab1, int[] tab2) {
        int[] tab = new int[tab1.length + tab2.length];
        int i;
        int aux1=0, aux2=0;
        for (i=0; i<tab.length; i++) {
            if (i%2 == 0) {
                tab[i] = tab1[aux1];
                aux1++;
            }
            else {
                tab[i] = tab2[aux2];
                aux2++;
            }
        }

        return tab;
    }
}
