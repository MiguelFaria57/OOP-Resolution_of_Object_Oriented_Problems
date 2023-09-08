public class Cafe extends Bebida {


    public Cafe() {
        /*nome = "Café";
        temperatura = 60;
        quantidade = 100;*/
        super("Café", 60, 100);
    }

    public Cafe(int t, String n) {
        temperatura = t;
        nome = n;
    }

    public Cafe(String n, int t, int q) {
        super(n, t, q);
    }
}
