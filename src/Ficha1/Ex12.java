public class Ex12 {
    public static void main(String[] args) {
        int i;
        System.out.printf("%d\n", logaritmoBinario(3));
        for (i=100; i<=1000; i+=100) {
            System.out.printf("%d ", logaritmoBinario(i));
        }
    }

    public static int logaritmoBinario(double num) {
        int aux=2, count=1;
        while (aux <= num) {
            aux = aux*2;
            if(aux <= num)
                count++;
        }

        return count;
    }
}
