public class Aluno {

    String nome;
    int idade;
    String matricula;
    double peso;
    double altura;

    public Aluno(String nome, int idade, String matricula, double peso, double altura) {

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.peso = peso;
        this.altura = altura;

    }

public void exibirInformacoes() {

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Peso: " + peso);
    System.out.println("Altura: " + altura);

    if (idade >= 18) {
    System.out.println("Maior de idade.");
} else {
    System.out.println("Menor de idade.");
}

}

}