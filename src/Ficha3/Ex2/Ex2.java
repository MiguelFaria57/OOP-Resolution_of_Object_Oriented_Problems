public class Ex2 {
    public static void main(String[] args) {
        Angulo ang1 = new Angulo();
        Angulo ang2 = new Angulo();


        inicializar(ang1, ang2, 100, 30);

        System.out.printf("\nO ângulo tem %.2f graus ou %.2f radianos.\n\n", ang1.getGrau(), ang1.radianos(ang1));

        if (Angulo.equals(ang1, ang2))
            System.out.println("Os ângulos são iguais.\n");
        else
            System.out.println("Os ângulos são diferentes.\n");

        System.out.printf("O seno do ângulo %.2f é %.2f.\n", ang1.adicao(ang2).getGrau(), Angulo.sin(ang1.adicao(ang2)));
        System.out.printf("O cosseno do ângulo %.2f é %.2f.\n", ang1.adicao(ang2).getGrau(), Angulo.cos(ang1.adicao(ang2)));
        System.out.printf("A tangente do ângulo %.2f é %.2f.\n\n", ang1.adicao(ang2).getGrau(), Angulo.tg(ang1.adicao(ang2)));
    }

    public static void inicializar(Angulo ang1, Angulo ang2, double grau1, double grau2) {
        ang1.setGrau(grau1);
        ang2.setGrau(grau2);
        System.out.println(ang1);
        System.out.println(ang2);
        Angulo resAd = ang1.adicao(ang2);
        System.out.println(resAd);
        Angulo resSub = ang1.subtracao(ang2);
        System.out.println(resSub);
    }
}
