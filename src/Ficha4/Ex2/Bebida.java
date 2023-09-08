public class Bebida {
    protected String nome;
    protected int temperatura;
    protected int quantidade;


    public Bebida (String n, int t, int q) {
        nome = n;
        temperatura = t;
        quantidade = q;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
