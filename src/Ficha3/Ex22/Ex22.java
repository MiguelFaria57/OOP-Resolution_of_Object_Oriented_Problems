import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        GestaoContactos gc = new GestaoContactos();

        System.out.println("""
                
                ----------------- MENU -----------------
                 1 - Adicionar Contacto
                 2 - Eliminar Contacto
                 3 - Ver Contactos de uma Lista
                 4 - Ver Todos os Contactos
                 5 - Ver o Contacto Mais Velho
                 6 - Ver o Contacto Mais Velho
                 7 - Ver Contactos Presentes na Lista Amigos e Profissional
                 8 - Ver Contactos entre Escalão Etário
                 9 - Sair
                """);
        int opcao;
        do {
            System.out.print("Indique a opção que pretende: ");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            if (opcao == 1)
                adicionaContacto(gc);
            if (opcao == 2)
                eliminaContacto(gc);
            if (opcao == 3)
                listaContactos(gc);
            if (opcao == 4)
                System.out.println(gc);
            if (opcao == 5)
                maisVelho(gc);
            if (opcao == 6)
                maisNovo(gc);
            if (opcao == 7)
                System.out.println(gc.toStringLista(gc.profissionaisAmigos()));
            if (opcao == 8)
                escalaoEtario(gc);
        } while (opcao != 9);
    }

    public static Contacto perguntasContacto() {
        Contacto c = new Contacto();
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique o nome: ");
        c.setNome(sc.nextLine());
        System.out.print("Indique a idade: ");
        c.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.print("Indique o sexo: ");
        c.setSexo(sc.nextLine());
        System.out.print("Indique a profissão: ");
        c.setProfissao(sc.nextLine());
        System.out.print("Indique o número de telefone: ");
        c.setTelefone(Integer.parseInt(sc.nextLine()));
        System.out.print("Indique o email: ");
        c.setEmail(sc.nextLine());

        return c;
    }

    public static void adicionaContacto(GestaoContactos gc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                         
                         Deseja introduzir um contacto de:
                          1 - familiares
                          2 - amigos
                          3 - âmbito profissional 
                         """);
        int opcao = 0;
        while (opcao!=1 && opcao!=2 && opcao!=3) {
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao == 1)
                gc.getFamilia().add(perguntasContacto());
            else if (opcao == 2)
                gc.getAmigos().add(perguntasContacto());
            else if (opcao == 3)
                gc.getProfissional().add(perguntasContacto());
        }
    }

    public static void eliminaContacto(GestaoContactos gc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIndique o nome do contacto que pretende eliminar: ");
        String nome = sc.nextLine();
        for (int i=0; i<gc.getFamilia().size(); i++) {
            if (nome.equals(gc.getFamilia().get(i).getNome())) {
                gc.getFamilia().remove(i);
            }
        }
        for (int i=0; i<gc.getAmigos().size(); i++) {
            if (nome.equals(gc.getAmigos().get(i).getNome())) {
                gc.getAmigos().remove(i);
            }
        }
        for (int i=0; i<gc.getProfissional().size(); i++) {
            if (nome.equals(gc.getProfissional().get(i).getNome())) {
                gc.getProfissional().remove(i);
            }
        }
        System.out.println("Contacto eliminado de todas as listas.");
    }

    public static void listaContactos(GestaoContactos gc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                         
                         Deseja ver os contactos de que lista:
                          1 - familiares
                          2 - amigos
                          3 - âmbito profissional 
                         """);
        int opcao = 0;
        while (opcao!=1 && opcao!=2 && opcao!=3) {
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao == 1)
                System.out.println(gc.toStringLista(gc.getFamilia()));
            else if (opcao == 2)
                System.out.println(gc.toStringLista(gc.getAmigos()));
            else if (opcao == 3)
                System.out.println(gc.toStringLista(gc.getProfissional()));
        }
    }

    public static void maisVelho(GestaoContactos gc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                                         
                Deseja ver o contacto mais velho de que lista:
                 1 - familiares
                 2 - amigos
                 3 - âmbito profissional 
                """);
        int opcao = 0;
        while (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao == 1)
                System.out.println(gc.maisVelho(gc.getFamilia()));
            else if (opcao == 2)
                System.out.println(gc.maisVelho(gc.getAmigos()));
            else if (opcao == 3)
                System.out.println(gc.maisVelho(gc.getProfissional()));
        }
    }

    public static void maisNovo(GestaoContactos gc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                                         
                Deseja ver o contacto mais novo de que lista:
                 1 - familiares
                 2 - amigos
                 3 - âmbito profissional 
                """);
        int opcao = 0;
        while (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao == 1)
                System.out.println(gc.maisNovo(gc.getFamilia()));
            else if (opcao == 2)
                System.out.println(gc.maisNovo(gc.getAmigos()));
            else if (opcao == 3)
                System.out.println(gc.maisNovo(gc.getProfissional()));
        }
    }

    public static void escalaoEtario(GestaoContactos gc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a idade mínima: ");
        int idadeMin = Integer.parseInt(sc.nextLine());
        System.out.print("Insira a idade máxima: ");
        int idadeMax = Integer.parseInt(sc.nextLine());
        System.out.printf("Contactos de pessoas com idades compreendidas entre %d e %d:\n", idadeMin, idadeMax);
        System.out.println(gc.toStringLista(gc.escalaoEtario(idadeMin, idadeMax)));
    }
}
