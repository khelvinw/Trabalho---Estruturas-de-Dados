import java.util.Scanner;

public class ProjetoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Aluno[] alunos = new Aluno[quantidade];
        int opcao;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Relatório por Nome (A-Z)");
            System.out.println("3 - Relatório por RA (Decrescente)");
            System.out.println("4 - Relatório de Aprovados");
            System.out.println("5 - Buscar aluno por RA (Busca Sequencial)");
            System.out.println("6 - Buscar aluno por RA (Busca Binária)");
            System.out.println("7 - Ordenar por Nome usando Merge Sort");
            System.out.println("8 - Contar alunos usando Recursividade");
            System.out.println("0 - Sair");
            System.out.println("===========================");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    cadastrarAlunos(alunos, scanner);

                    break;

                case 2:

                    if (possuiAlunos(alunos)) {

                        BubbleSort.bubbleSort(alunos);

                        System.out.println("\n===== ALUNOS POR NOME =====");

                        exibirAlunos(alunos);

                    }

                    break;

                case 3:

                    if (possuiAlunos(alunos)) {

                        SelectionSort.ordenarPorRaDecrescente(alunos);

                        System.out.println("\n===== ALUNOS POR RA =====");

                        exibirAlunos(alunos);

                    }

                    break;

                case 4:

                    if (possuiAlunos(alunos)) {

                        BubbleSort.bubbleSort(alunos);

                        System.out.println("\n===== ALUNOS APROVADOS =====");

                        exibirAprovados(alunos);

                    }

                    break;

                case 5:

                    if (possuiAlunos(alunos)) {

                        System.out.print("Digite o RA que deseja procurar: ");
                        int ra = scanner.nextInt();

                        int posicao = BuscaSequencial.linearSearch(alunos, ra);

                        if (posicao != -1) {

                            System.out.println("\nAluno encontrado:");

                            alunos[posicao].exibirDados();

                        } else {

                            System.out.println("\nAluno não encontrado.");
                        }
                    }

                    break;

                case 6:

                    if (possuiAlunos(alunos)) {
                        SelectionSort.ordenarPorRaCrescente(alunos);

                        System.out.print("Digite o RA que deseja procurar: ");
                        int ra = scanner.nextInt();

                        int posicao = BuscaBinaria.binarySearch(alunos, ra);

                        if (posicao != -1) {

                            System.out.println("\nAluno encontrado:");

                            alunos[posicao].exibirDados();

                        } else {

                            System.out.println("\nAluno não encontrado.");
                        }
                    }

                    break;

                case 7:

                    if (possuiAlunos(alunos)) {

                        MergeSort.mergeSort(alunos, 0, alunos.length - 1);

                        System.out.println("\n===== ALUNOS ORDENADOS POR MERGE SORT =====");

                        exibirAlunos(alunos);
                    }

                    break;

                case 8:

                    if (possuiAlunos(alunos)) {

                        int total = Recursividade.contarAlunos(alunos, 0);

                        System.out.println("\nQuantidade de alunos: " + total);
                    }

                    break;

                case 0:

                    System.out.println("\nPrograma encerrado.");

                    break;

                default:

                    System.out.println("\nOpção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void cadastrarAlunos(Aluno[] alunos, Scanner scanner) {

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("\n===== CADASTRO DO ALUNO " + (i + 1) + " =====");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("RA: ");
            int ra = scanner.nextInt();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Média: ");
            double media = scanner.nextDouble();

            scanner.nextLine();

            alunos[i] = new Aluno(nome, ra, idade, sexo, media);

            System.out.println("Aluno cadastrado com sucesso!");
        }
    }

    public static void exibirAlunos(Aluno[] alunos) {

        for (int i = 0; i < alunos.length; i++) {

            alunos[i].exibirDados();

            System.out.println("---------------------------");
        }
    }

    public static void exibirAprovados(Aluno[] alunos) {

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i].resultado.equals("Aprovado")) {

                alunos[i].exibirDados();

                System.out.println("---------------------------");
            }
        }
    }

    public static boolean possuiAlunos(Aluno[] alunos) {

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] != null) {

                return true;
            }
        }

        System.out.println("\nNenhum aluno foi cadastrado.");

        return false;
    }
}