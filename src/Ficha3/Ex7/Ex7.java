import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*System.out.print("Indique quantas tarefas pretende adicionar: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GerirTarefas listaTarefas = new GerirTarefas(n);*/

        GerirTarefas listaTarefas = new GerirTarefas(3);
        DadosTarefa t1 = new DadosTarefa("T1", new Data(1,1,2001),
                "normal", "pessoal", "nr");
        listaTarefas.addTarefa(t1);
        DadosTarefa t2 = new DadosTarefa("T2", new Data(2,2,2002),
                "normal2", "pessoal2", "nr2");
        listaTarefas.addTarefa(t2);
        DadosTarefa t3 = new DadosTarefa();
        listaTarefas.addTarefa(t3);
        System.out.print(listaTarefas);
    }
}
