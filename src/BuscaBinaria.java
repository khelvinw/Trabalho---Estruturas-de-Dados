public class BuscaBinaria {

    public static int binarySearch(Aluno[] alunos, int ra) {

        int inicio = 0;
        int fim = alunos.length - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (alunos[meio].ra == ra) {

                return meio;
            }

            if (alunos[meio].ra < ra) {

                inicio = meio + 1;

            } else {

                fim = meio - 1;
            }
        }

        return -1;
    }
}