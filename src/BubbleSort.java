public class BubbleSort {
    public static void bubbleSort(Aluno[] alunos) {
        int n = alunos.length;

        for (int i = 0; i < n - 1; i++) {

            boolean trocou = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (alunos[j].nome.compareTo(alunos[j + 1].nome) > 0) {
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou)
                break;
        }
    }
}