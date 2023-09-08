public class Ave extends Animal {
    private String deslocacao;


    public Ave() {
        tipo = "Ave";
    }

    public Ave(String i, String d) {
        tipo = "Ave";
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
