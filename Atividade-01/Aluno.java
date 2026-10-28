public class Aluno {
    
    private String nome;
    private int idade;
    private String matricula;
    private double peso;
    private double altura;

    
    public Aluno(String nome, int idade, String matricula, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.peso = peso;
        this.altura = altura;
    }

    
    private boolean isMaiorDeIdade() {
        return this.idade >= 18;
    }

    
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        
        // Condição para dizer se é maior de idade
        if (isMaiorDeIdade()) {
            System.out.println("Status: É maior de idade.");
        } else {
            System.out.println("Status: É menor de idade.");
        }
        
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("-----------------------------------");
    }
}
