public class Aluno extends Pessoa{
    private int numA;


    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int num) {
        this.nome = nome;
        numA = num;
    }


    public int getNumA() {
        return numA;
    }
    public void setNumA(int numA) {
        this.numA = numA;
    }


    public String missao() {
        return "aprender";
    }

    @Override
    public String toString() {
        return "O aluno " + nome + " com o número " + numA + " tem uma missão de " + missao();
    }
}
