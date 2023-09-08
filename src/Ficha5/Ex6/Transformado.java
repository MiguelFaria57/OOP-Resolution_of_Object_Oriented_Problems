public class Transformado extends Produto {
    protected double pesoBruto;
    protected double custoMedioTransKg;


    public Transformado() {}

    public Transformado(double pesoBruto, double custoMedioTransKg) {
        this.pesoBruto = pesoBruto;
        this.custoMedioTransKg = custoMedioTransKg;
    }


    public double custoFinal() {
        return super.custoFinal() + (pesoBruto-peso)*custoMedioTransKg;
    }


    @Override
    public String toString() {
        return "Transformado{" +
                "pesoBruto=" + pesoBruto +
                ", custoMedioTransKg=" + custoMedioTransKg +
                ", descricao='" + descricao + '\'' +
                ", origem='" + origem + '\'' +
                ", peso=" + peso +
                ", iva=" + iva +
                ", preco=" + preco +
                '}';
    }
}
