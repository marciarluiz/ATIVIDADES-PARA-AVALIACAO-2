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
    public boolean ehMaiorDeIdade() {
        return this.idade >= 18;
    }
    public void exibirInformacoes() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos (" + (ehMaiorDeIdade() ? "Maior de idade" : "Menor de idade") + ")");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("----------------------------------------");
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}