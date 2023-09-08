public class Produto {
    protected String descricao;
    protected String origem;
    protected double peso;
    protected int iva;
    protected double preco;


    public Produto() {}

    public Produto(String descricao, String origem, double peso, int iva, double preco) {
        this.descricao = descricao;
        this.origem = origem;
        this.peso = peso;
        this.iva = iva;
        this.preco = preco;
    }


    public double custoFinal() {
        return peso*preco+iva*peso*preco;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", origem='" + origem + '\'' +
                ", peso=" + peso +
                ", iva=" + iva +
                ", preco=" + preco +
                '}';
    }
}
