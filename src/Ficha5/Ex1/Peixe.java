public class Peixe extends Animal {
    private String deslocacao;


    public Peixe() {
        tipo = "Peixe";
    }

    public Peixe(String i, String d) {
        tipo = "Peixe";
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
