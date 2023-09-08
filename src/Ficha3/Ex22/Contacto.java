public class Contacto {
    private String nome;
    private int idade;
    private String sexo;
    private String profissao;
    private int telefone;
    private String email;


    public Contacto() {}

    public Contacto(String nome, int idade, String sexo, String profissao, int telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return nome + ", " + idade + " anos de idade, do sexo " + sexo + ", " + profissao
                        + ", telefone nº " + telefone + ", email: " + email + "\n";
    }
}
