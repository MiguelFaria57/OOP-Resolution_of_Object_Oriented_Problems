public class Carro extends Veiculo {
    private int numProprietarios;


    public Carro() {}

    public Carro(int numProprietarios) {
        this.numProprietarios = numProprietarios;
    }


    public int getNumProprietarios() {
        return numProprietarios;
    }
    public void setNumProprietarios(int numProprietarios) {
        this.numProprietarios = numProprietarios;
    }
}
