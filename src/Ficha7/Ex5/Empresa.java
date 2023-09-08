public class Empresa {
    private String nome;
    private String ramoAtuacao;


    public Empresa() {}

    public Empresa(String nome, String ramoAtuacao) {
        this.nome = nome;
        this.ramoAtuacao = ramoAtuacao;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamoAtuacao() {
        return ramoAtuacao;
    }
    public void setRamoAtuacao(String ramoAtuacao) {
        this.ramoAtuacao = ramoAtuacao;
    }
}
