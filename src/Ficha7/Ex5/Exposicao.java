import java.util.ArrayList;
import java.util.Collections;

public class Exposicao{
    private ArrayList<Veiculo> veiculos;


    public Exposicao() {
        veiculos = new ArrayList<>();
    }

    public Exposicao(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }


    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }


    public ArrayList<Veiculo> ordemAnoConstrucao() {
        ArrayList<Veiculo> ordemAnoConstrucao = veiculos;
        Collections.sort(ordemAnoConstrucao);
        return ordemAnoConstrucao;
    }

    /*public Autocarro autocarroMaisUsado() {
        Autocarro autocarroMaisUsado;
        for (int i=0; i<veiculos.size(); i++) {
            if (veiculos.get(i)==)
        }
        return autocarroMaisUsado;
    }*/
}
