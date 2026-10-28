public class Main {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Ian", 22, "111111", 78.5, 1.65);
        
      
        Aluno aluno2 = new Aluno("Leonardo", 23, "2222222", 55.2, 1.82);

       
        System.out.println("Dados do Aluno 1:");
        aluno1.exibirInformacoes();

        System.out.println("Dados do Aluno 2:");
        aluno2.exibirInformacoes();
    }
}
