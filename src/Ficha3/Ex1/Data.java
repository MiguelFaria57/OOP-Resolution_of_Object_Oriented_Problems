public class Data {
    private int dia, mes, ano;

    Data() {}

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    int getDia() {return dia;}
    int getMes() {return mes;}
    int getAno() {return ano;}

    void setDia(int d) {dia = d;}
    void setMes(int m) {mes = m;}
    void setAno(int a) {ano = a;}

    public String toString() {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        return dia + " de " + meses[mes-1] + " de " + ano;
    }
}
