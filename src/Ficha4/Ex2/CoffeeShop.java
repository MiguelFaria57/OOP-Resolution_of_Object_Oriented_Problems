public class CoffeeShop {
    public static void main(String[] args) {
        Bebida b1 = new Bebida("B", 10, 10);
        Cafe c1 = new Cafe("Café", 60, 100);
        Expresso e1 = new Expresso(70, "Curto", "Expresso");
        System.out.println(b1.getNome());
    }
}
