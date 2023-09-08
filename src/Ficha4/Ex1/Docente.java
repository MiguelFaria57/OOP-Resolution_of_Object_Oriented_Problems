public class Docente extends Pessoa {
    private int numMG;


    public Docente(String nome) {
        this.nome = nome;
    }

    public Docente(String nome, int num) {
        this.nome = nome;
        numMG = num;
    }


    public int getNumMG() {
        return numMG;
    }
    public void setNumMG(int numMG) {
        this.numMG = numMG;
    }


    public String missao() {
        return "ensinar";
    }


    @Override
    public String toString() {
        return "O docente " + nome + " com o número " + numMG + " tem uma missão de " + missao();
    }
}
