public class GerirTarefas {
    private DadosTarefa[] tarefas;

    public GerirTarefas() {}

    public GerirTarefas(int num) {
        tarefas = new DadosTarefa[num];
    }

    public GerirTarefas(DadosTarefa[] tarefas) {
        this.tarefas = tarefas;
    }

    public DadosTarefa[] getTarefas() {return tarefas;}

    public void setTarefas(DadosTarefa[] dt) {tarefas = dt;}

    public void addTarefa(DadosTarefa d) {
        int i=0;
        while (tarefas[i]!=null) {
            i++;
        }
        tarefas[i] = d;
    }

    /*public void delTarefa(DadosTarefa d) {
        DadosTarefa;
    }*/

    public String toString() {
        String texto = "";
        int i;
        for (i=0; i< tarefas.length; i++) {
            texto += "\nTarefa " + (i+1) + tarefas[i];
        }

        return texto;
    }
}