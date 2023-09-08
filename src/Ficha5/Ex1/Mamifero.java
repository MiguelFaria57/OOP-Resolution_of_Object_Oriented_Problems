public class Mamifero extends Animal {
    private String deslocacao;


    public Mamifero(String i, String d) {
        tipo = "Mamífero";
        id = i;
        deslocacao = d;
    }


    public String getDeslocacao() {
        return deslocacao;
    }
    public void setDeslocacao(String deslocacao) {
        this.deslocacao = deslocacao;
    }


    public String desloca() {
        return tipo + " " + id + " a " + deslocacao;
    }
}
