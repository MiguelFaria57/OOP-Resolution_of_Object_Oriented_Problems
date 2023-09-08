public class Conserva extends Transformado {
    private double valorProdKg;


    public Conserva() {}

    public Conserva(double valorProdKg) {
        this.valorProdKg = valorProdKg;
    }


    public double custoFinal() {
        return super.custoFinal() + Math.abs(peso-pesoBruto)*valorProdKg;
    }


    @Override
    public String toString() {
        return "Conserva{" +
                "valorProdKg=" + valorProdKg +
                ", pesoBruto=" + pesoBruto +
                ", custoMedioTransKg=" + custoMedioTransKg +
                ", descricao='" + descricao + '\'' +
                ", origem='" + origem + '\'' +
                ", peso=" + peso +
                ", iva=" + iva +
                ", preco=" + preco +
                '}';
    }
}
