package Matriz;

import java.util.Random;

public class ListaExtra {
    Random rd = new Random();

    public void exercicio1() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = i * j;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }
    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(20);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" | ");
        }

        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O maior termo da matriz é: "+maior+" e está na linha : "+linha+" e coluna: "+coluna);
    }
    public void exercicio3() {
        int matriz[][] = new int[5][5];
        
    }
}
