public class Animal {
    protected String tipo;
    protected String id;


    public Animal() {}

    public Animal(String t, String i) {
        tipo = t;
        id = i;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String desloca() {
        return "Animal a deslocar-se.";
    }
}
