package desafios.idadePessoa;

public class IdadePessoa {

        private String nome;
        private int idade;

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println(nome + " eh maior de idade.");
        } else {
            System.out.println(nome + " nao eh maior de idade.");
        }
    }
}

