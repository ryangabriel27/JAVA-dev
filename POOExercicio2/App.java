package POOExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Random rd = new Random();
        // vetor de objetos
        Agenda contatos[] = new Agenda[10]; // vetor de objetos 10

        // criar os objetos e preencher os atributos
        for (int i = 0; i < contatos.length; i++) {
            // construindo o objeto
            contatos[i] = new Agenda();
            // preencher meu contatoseto
            contatos[i].setNome(JOptionPane.showInputDialog("Digite o Nome:"));
            contatos[i].setAltura(rd.nextDouble(12));
            contatos[i].setIdade(i + 18);
        }

        // criar um metodo para busca uma pessoa do array
        String buscarNome = JOptionPane.showInputDialog("Informe o nome a ser buscado: ");
        boolean buscar = true;
        int cont = 0;
        while (buscar) {
            if (buscarNome.equals(contatos[cont].getNome())) {
                buscar = false;
                contatos[cont].imprimir();
            }
            cont++;
        }
    }
}
