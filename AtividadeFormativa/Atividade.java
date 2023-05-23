package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Vamos criar uma matriz!");
        System.out.print("Digite o numero de linhas: ");
        int nLinhas = sc.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int nColunas = sc.nextInt();

        int matriz[][] = new int[nLinhas][nColunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        System.out.println("A matriz com os valores randomizados fica:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        System.out.println("Substituindo os valores: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }
    }

    public void exercicio2() {
      int nSorteio = rd.nextInt(1000);
      boolean tenteNovamente = true;
      int nDigitado;
      int cont = 0;
      System.out.println(" === Tente adivinhar o numero sorteado ===");
      while (tenteNovamente) {
        System.out.print("Digite o seu palpite: ");
        nDigitado = sc.nextInt();
        if (nDigitado == nSorteio) {
            tenteNovamente = false;
        }
        if ( nDigitado != nSorteio) {
            System.out.println("Errou, tente novamente");
        }
        if (nDigitado > nSorteio) {
            System.out.println("*Dica: O número que você digitou é maior que o sorteado");
        } else {
            System.out.println("*Dica: O número que você digitou é menor que o sorteado");
        }
        cont++;
      }
      System.out.println("Parabéns , você acertou em "+cont+" tentativas");

    }
    public void exercicio3() {
        int tamanhoVetor = (rd.nextInt(900)+100);
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (rd.nextInt(99)+1);
        }

        System.out.println("Os números pares no vetor são: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0) {
                System.out.println("vetor["+i+"]= "+vetor[i]);
            }
        }
        System.out.println("=======================================");
        System.out.println("Os números ímpares no vetor são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1) {
                System.out.println("vetor["+i+"]= "+vetor[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println("Os números pares nas posições ímpares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0 && (i+1)%2 == 1) {
                System.out.println("Vetor posição: "+(i+1)+" = "+vetor[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println("Os números ímpares nas posições pares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1 && (i+1)%2 == 0) {
                System.out.println("Vetor posição: "+(i+1)+" = "+vetor[i]);
            }
        }
    }

}
