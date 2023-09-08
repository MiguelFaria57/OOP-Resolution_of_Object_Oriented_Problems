public class Veiculo implements Comparable<Veiculo>{
    protected int anoConstrucao;
    protected double valorAtual;
    protected String cor;


    public Veiculo() {}

    public Veiculo(int anoConstrucao, double valorAtual, String cor) {
        this.anoConstrucao = anoConstrucao;
        this.valorAtual = valorAtual;
        this.cor = cor;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }
    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public double getValorAtual() {
        return valorAtual;
    }
    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public int compareTo(Veiculo v) {
        int compareData = ((Veiculo)v).getAnoConstrucao();
        return this.anoConstrucao-compareData;
    }
}
