import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] data = new int[3];
        System.out.print("Indique o dia: ");
        Scanner sc0 = new Scanner(System.in);
        data[0] = sc0.nextInt();
        System.out.print("Indique o mes: ");
        Scanner sc1 = new Scanner(System.in);
        data[1] = sc1.nextInt();
        System.out.print("Indique o ano: ");
        Scanner sc2 = new Scanner(System.in);
        data[2] = sc2.nextInt();
        Data dataExtenso = new Data(data[0],data[1],data[2]);
        System.out.print(dataExtenso);
    }
}
