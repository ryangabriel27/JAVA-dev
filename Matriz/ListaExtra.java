package Matriz;

import java.util.Random;
import java.util.Scanner;

public class ListaExtra {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

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
                matriz[i][j] = rd.nextInt(50);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
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
        System.out.println(
                "O maior termo da matriz é: " + maior + " e está na linha : " + linha + " e coluna: " + coluna);
    }

    public void exercicio3() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(20);
            }
        }
        System.out.print("Digite um valor para X :");
        int valorX = sc.nextInt();
        System.out.println("=========================");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("=========================");
        int linha = 0;
        int coluna = 0;
        int x = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == valorX) {
                    linha = i;
                    coluna = j;
                    x++;
                }
            }
        }
        if (x != 0) {
            System.out.println("O valor X na matriz está na linha: " + linha + " e na coluna: " + coluna);
        } else {
            System.out.println(" A matriz não tem o valor X");
        }
    }

    public void exercicio4() {
        int matriz[][] = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = (3 * i * i) - 1;
                } else if (i > j) {
                    matriz[i][j] = (4 * i * i * i) - (5 * j * j);
                } else {
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                }
            }
        }
        System.out.println("=========================");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("=========================");
    }
    public void exercicio6() {
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizC[][] = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizA[i][j] = rd.nextInt(10);
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizB[i][j] = rd.nextInt(10);
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizC[i][j] = rd.nextInt(10);
            }
        }
    }
}
