package POOExercicio2;

import javax.swing.JOptionPane;

public class Agenda {
    double altura;
    String nome;
    int idade;

    // métodos
    // construtor com parametros
    public Agenda(double altura, String nome, int idade) {
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }

    // construtor vazio
    public Agenda() {
    }

    // getters and setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // métodos de aplicação diversas
    // imprimir (void)
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                "/ Altura: " + altura +
                " / Idade: " + idade);
    }
} 