public class Ex1 {
    public static void main(String[] args) {
        int max = 100;
        int soma = 0;
        float media;
        int[] tab = new int[10];
        for (int i=0; i<tab.length; i++) {
            tab[i] = (int) (Math.random()*max);
            System.out.printf("Número aleatório: %d     Posição: %d\n", tab[i], i);
            soma += tab[i];
        }
        media = (float) soma/tab.length;
        System.out.printf("A média é %.2f.", media);
    }
}
