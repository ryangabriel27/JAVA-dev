package IteracaoFor;

import java.util.Scanner;

public class ExercicioFor {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetorA[] = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetorA[" + i + "]=");
            vetorA[i] = sc.nextInt();
        }
        System.out.println("==============================================");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("O valor do vetorA[" + i + "] é " + vetorA[i]);
        }
    }

    public void exercicio2() {
        double vetorA[] = new double[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetorA[" + i + "]=");
            vetorA[i] = sc.nextDouble();
        }
        for (int i = vetorA.length - 1; i >= 0; i--) {
            System.out.println("O valor do vetorA[" + i + "]= " + vetorA[i]);
        }
    }

    public void exercicio3() {
        int notas[] = new int[4];
        System.out.println("Digite as 4 notas em ordem");
        notas[0] = sc.nextInt();
        notas[1] = sc.nextInt();
        notas[2] = sc.nextInt();
        notas[3] = sc.nextInt();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("A nota " + i + " é " + notas[i]);
        }
        // calculando a média
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("E a média foi de : " + media);
    }
}
