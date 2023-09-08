public class Ex1 {
    public static void main(String[] args) {
        Animal[] a1 = new Animal[4];
        a1[0] = new Mamifero("Cão", "andar");
        a1[1] = new Ave("Águia", "voar");
        a1[2] = new Reptil("Cobra", "rastejar");
        a1[3] = new Peixe("Sardinha", "nadar");
        for (Animal i : a1) {
            System.out.println(i.desloca());
        }
    }
}