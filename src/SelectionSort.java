public class SelectionSort {
    public static void ordenarPorRaCrescente(Aluno[] alunos) {
        int n = alunos.length;

        for (int i = 0; i < n - 1; i++) {

            int minIdx = i;

            for (int j = i + 1; j < n; j++) {

                if (alunos[j].ra < alunos[minIdx].ra) {

                    minIdx = j;
                }
            }

            Aluno temp = alunos[i];
            alunos[i] = alunos[minIdx];
            alunos[minIdx] = temp;
        }

    }

    public static void ordenarPorRaDecrescente(Aluno[] alunos) {
        int n = alunos.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {

                if (alunos[j].ra > alunos[maxIdx].ra) {

                    maxIdx = j;
                }
            }

            Aluno temp = alunos[i];
            alunos[i] = alunos[maxIdx];
            alunos[maxIdx] = temp;
        }

    }


}
