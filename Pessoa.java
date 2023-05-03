public class Pessoa {

    private String nome;
    private int idade;
    private String endereço;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public int getIdade() {
        return idade;

    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;

    }

    public String getEndereço() {
        return endereço;

    }

    public Pessoa(String nome, int idade, String endereço) {
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }

    public Pessoa() {

    }

}