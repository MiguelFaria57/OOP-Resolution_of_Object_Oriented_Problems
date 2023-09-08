import java.util.ArrayList;

public class GestaoContactos {
    private ArrayList<Contacto> familia;
    private ArrayList<Contacto> amigos;
    private ArrayList<Contacto> profissional;


    public GestaoContactos() {
        this.familia = new ArrayList<>();
        this.amigos = new ArrayList<>();
        this.profissional = new ArrayList<>();
    }

    public GestaoContactos(ArrayList<Contacto> familia, ArrayList<Contacto> amigos, ArrayList<Contacto> profissional) {
        this.familia = familia;
        this.amigos = amigos;
        this.profissional = profissional;
    }


    public ArrayList<Contacto> getFamilia() {
        return familia;
    }
    public void setFamilia(ArrayList<Contacto> familia) {
        this.familia = familia;
    }

    public ArrayList<Contacto> getAmigos() {
        return amigos;
    }
    public void setAmigos(ArrayList<Contacto> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Contacto> getProfissional() {
        return profissional;
    }
    public void setProfissional(ArrayList<Contacto> profissional) {
        this.profissional = profissional;
    }


    public Contacto maisVelho(ArrayList<Contacto> lista) {
        Contacto c = lista.get(0);
        for (int i=1; i<lista.size(); i++) {
            if (lista.get(i).getIdade() > c.getIdade())
                c = lista.get(i);
        }

        return c;
    }

    public Contacto maisNovo(ArrayList<Contacto> lista) {
        Contacto c = lista.get(0);
        for (int i=1; i<lista.size(); i++) {
            if (lista.get(i).getIdade() < c.getIdade())
                c = lista.get(i);
        }

        return c;
    }

    public ArrayList<Contacto> profissionaisAmigos() {
        ArrayList<Contacto> lista = new ArrayList<>();
        for (int i=0; i<profissional.size(); i++) {
            for (int j=0; j<amigos.size(); j++) {
                if (profissional.get(i).getNome().equals(amigos.get(j).getNome()))
                    lista.add(profissional.get(i));
            }
        }

        return lista;
    }

    public ArrayList<Contacto> escalaoEtario(int idadeMin, int idadeMax) {
        ArrayList<Contacto> lista = new ArrayList<>();
        int i;
        for (i=0; i< familia.size(); i++) {
            if (familia.get(i).getIdade()>idadeMin && familia.get(i).getIdade()<idadeMax)
                lista.add(familia.get(i));
        }
        for (i=0; i< amigos.size(); i++) {
            if (amigos.get(i).getIdade()>idadeMin && amigos.get(i).getIdade()<idadeMax)
                lista.add(amigos.get(i));
        }
        for (i=0; i< profissional.size(); i++) {
            if (profissional.get(i).getIdade()>idadeMin && profissional.get(i).getIdade()<idadeMax)
                lista.add(profissional.get(i));
        }

        return lista;
    }


    public String toStringLista(ArrayList<Contacto> lista) {
        String texto = "";
        int i;
        for (i = 0; i < lista.size(); i++) {
            texto += "Contacto " + (i + 1) + "\n" + lista.get(i);
        }

        return texto;
    }

    public String toString() {
        String texto = "";
        int i;
        for (i=0; i< familia.size(); i++) {
            texto += "Contacto Família " + (i+1) + "\n" + familia.get(i);
        }
        for (i=0; i< amigos.size(); i++) {
            texto += "Contacto Amigos " + (i+1) + "\n" + amigos.get(i);
        }
        for (i=0; i< profissional.size(); i++) {
            texto += "Contacto Profissional " + (i+1) + "\n" + profissional.get(i);
        }

        return texto;
    }
}