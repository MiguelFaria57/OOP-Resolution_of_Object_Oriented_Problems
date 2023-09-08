public class Angulo {
    private double grau;

    Angulo() {
        grau = 0;
    }

    Angulo(double grau) {
        this.grau = grau;
    }

    Angulo adicao(Angulo a) {
        //Angulo resAdi = new Angulo(this.grau + a.grau);
        //return resAdi;
        return new Angulo(this.grau + a.grau);
    }

    Angulo subtracao(Angulo a) {
        //Angulo resSub = new Angulo(this.grau - a.grau);
        //return resSub;
        return new Angulo(this.grau - a.grau);
    }

    double getGrau() {return grau;}

    void setGrau(double g) {grau = g;}

    public static double radianos(Angulo ang) {
        return Math.toRadians(ang.getGrau());
    }

    public static boolean equals(Angulo ang1, Angulo ang2) {
        return ang1.getGrau() == ang2.getGrau();
    }

    public static double sin(Angulo ang) {
        return Math.sin(ang.getGrau());
    }

    public static double cos(Angulo ang) {
        return Math.cos(ang.getGrau());
    }

    public static double tg(Angulo ang) {
        return Math.tan(ang.getGrau());
    }

    public String toString() {
        return ("Ângulo de " + grau + " graus.");
    }
}
