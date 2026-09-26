public class BuscaSequencial {
    public static int linearSearch(Aluno[] alunos, int ra) {
        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i].ra == ra) {
                return i;
            }
        }
        return -1;
    }
}
