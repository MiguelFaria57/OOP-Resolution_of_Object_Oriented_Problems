public class DadosTarefa {
    private String titulo;
    private Data data;
    private String prioridade;
    private String categoria;
    private String estado;

    public DadosTarefa() {
        prioridade = "normal";
        estado = "não realizada";
    }

    public DadosTarefa(String titulo, Data data, String prioridade, String categoria, String estado) {
        this.titulo = titulo;
        this.data = data;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getTitulo() {return titulo;}
    public Data getData() {return data;}
    public String getPrioridade() {return prioridade;}
    public String getCategoria() {return categoria;}
    public String getEstado() {return estado;}

    public void setTitulo(String t) {titulo = t;}
    public void setData(Data d) {data =d;}
    public void setPrioridade(String p) {prioridade = p;}
    public void setCategoria(String c) {categoria = c;}
    public void setEstado(String e) {estado = e;}

    public String toString() {
        return "\n - Título: " + titulo + "\n - Data: " + data + "\n - Prioridade: " + prioridade
                + "\n - Categoria: " + categoria + "\n - Estado: " + estado + "\n";
    }
}
