public class Fresco extends Produto {
    private double precoEmbKg;


    public Fresco() {}

    public Fresco(double precoEmbKg) {
        this.precoEmbKg = precoEmbKg;
    }


    public double custoFinal() {
        return super.custoFinal() + precoEmbKg;
    }


    @Override
    public String toString() {
        return "Fresco{" +
                "precoEmbKg=" + precoEmbKg +
                ", descricao='" + descricao + '\'' +
                ", origem='" + origem + '\'' +
                ", peso=" + peso +
                ", iva=" + iva +
                ", preco=" + preco +
                '}';
    }
}
