public class Reptil extends Animal {
    private String deslocacao;


    public Reptil() {
        tipo = "Réptil";
    }

    public Reptil(String i, String d) {
        tipo = "Réptil";
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
