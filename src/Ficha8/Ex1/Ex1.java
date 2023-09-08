import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    /*public static void main(String[] args) {
        ArrayList<String> texto = new ArrayList<>();
        System.out.print("Indique o nome do ficheiro que contém as temperaturas: ");
        Scanner sc = new Scanner(System.in);
        String nomeFich = sc.nextLine();
        try {
            File f = new File(nomeFich);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                texto.add(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Erro - ficheiro '%s' não existe\n", nomeFich);
        } catch (IOException e) {
            System.out.print("Erro - exceção ao ler uma linha do ficheiro\n");
        }
        System.out.println(texto.toString());
        int i;
        ArrayList<int[]> temperaturas = new ArrayList<>();
        for (i=0; i<texto.size(); i++) {
            String[] temps = new String[2];
            temps = texto.get(i).split(";");
            int[] tempsInt = Integer.parseInt(temps[0]), Integer.parseInt(temps[1]);
            temperaturas.add(tempsInt);
        }
    }*/
}
