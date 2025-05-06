package desafios.idadePessoa;

public class IdadePessoaPrincipal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Lalala");
        pessoa1.setIdade(32);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Jejeje");
        pessoa2.setIdade(10);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println("\n" + pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}
