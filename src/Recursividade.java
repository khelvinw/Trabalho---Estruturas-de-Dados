public class Recursividade {

    public static int contarAlunos(Aluno[] alunos, int posicao) {

        if (posicao == alunos.length) {
            return 0;
        }

        return 1 + contarAlunos(alunos, posicao + 1);
    }
}