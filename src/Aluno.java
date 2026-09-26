public class Aluno {
    String nome;
    int ra;
    int idade;
    String sexo;
    double media;
    String resultado;

    public Aluno(String nome, int ra, int idade, String sexo, double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;

        if (media >= 6) {
            this.resultado = "Aprovado";
        } else {
            this.resultado = "Reprovado";
        }
    }

    public void exibirDados() {

        System.out.println("--------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
        System.out.println("--------------------------------");
    }
}
