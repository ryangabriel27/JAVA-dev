package POOHerança;

public class Pessoas {
    // superclasse (fornece herança para os outras classes)
    // atributos genéricos (comuns a todas as classes herdeiras)

    String nome;
    String endereco;
    int idade;
    String cpf;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos
    
}
