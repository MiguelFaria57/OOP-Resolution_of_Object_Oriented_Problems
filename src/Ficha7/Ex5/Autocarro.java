import java.util.ArrayList;

public class Autocarro extends Veiculo {
    private ArrayList<Empresa> empresas;
    private int anoFimServico;


    public Autocarro() {
        empresas = new ArrayList<>();
    }

    public Autocarro(ArrayList<Empresa> empresas, int anoFimServico) {
        this.empresas = empresas;
        this.anoFimServico = anoFimServico;
    }


    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }
    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public int getAnoFimServico() {
        return anoFimServico;
    }
    public void setAnoFimServico(int anoFimServico) {
        this.anoFimServico = anoFimServico;
    }
}
