public class Pessoa {
    protected String nome;


    public Pessoa() {}

    public Pessoa(String n) {
        nome = n;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String comunica() {
        return nome + " a comunicar.";
    }


    public String toString() {
        return nome;
    }
}
