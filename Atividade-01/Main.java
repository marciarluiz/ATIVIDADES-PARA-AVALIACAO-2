public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria", 20, "2026001", 60.5, 1.65);

        Aluno aluno2 = new Aluno("Pedro", 17, "2026002", 70.0, 1.75);

        aluno1.exibirInformacoes();

        System.out.println("-------------------");

        aluno2.exibirInformacoes();

    }

}