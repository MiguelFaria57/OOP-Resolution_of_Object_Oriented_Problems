public class FiguraGeometrica {
    protected String nome;

    public double area(){
        return 0.2;
    }

    public String propriedades() {
        return "Nome = " + nome;
    }

    public String toString() {
        return "Figura Geométrica: \n" + nome;
    }
}
