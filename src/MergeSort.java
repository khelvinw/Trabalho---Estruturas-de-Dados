import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(Aluno[] alunos, int left, int right) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(alunos, left, mid);

        mergeSort(alunos, mid + 1, right);

        merge(alunos, left, mid, right);
    }

    public static void merge(Aluno[] alunos, int left, int mid, int right) {

        Aluno[] leftArr = Arrays.copyOfRange(alunos, left, mid + 1);

        Aluno[] rightArr = Arrays.copyOfRange(alunos, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {

            if (leftArr[i].nome.compareToIgnoreCase(rightArr[j].nome) <= 0) {

                alunos[k++] = leftArr[i++];

            } else {

                alunos[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length)
            alunos[k++] = leftArr[i++];

        while (j < rightArr.length)
            alunos[k++] = rightArr[j++];
    }
}