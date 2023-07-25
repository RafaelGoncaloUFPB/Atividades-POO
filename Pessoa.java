
public class Pessoa {
        // Atributos da classe Pessoa
        private String nome;
        private int idade;
        private String endereco;

        // Construtor padrão sem parâmetros
        public Pessoa() {
            this.nome = "";
            this.idade = 0;
            this.endereco = "";
        }

        // Construtor com parâmetros para definir os atributos na criação do objeto
        public Pessoa(String nome, int idade, String endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

        // Método para exibir informações da pessoa
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Endereço: " + endereco);
        }

        // Método para definir um novo endereço para a pessoa
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    }
