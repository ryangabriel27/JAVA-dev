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
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" Digite a nota " + (i + 1));
            notas[i] = sc.nextDouble();
        }
        System.out.println("====================================");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("A nota " + (i + 1) + " é :" + notas[i]);
        }
        // calculando a média
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("E a média foi de : " + media);
    }

    public void exercicio4() {
        String letras[] = new String[10];
        System.out.println("Digite 10 caracteres");
        System.out.println("================================");
        for (int i = 0; i < letras.length; i++) {
            System.out.println(i + "º caracter");
            letras[i] = sc.nextLine();
            System.out.println("===============================");
        }
        int cont = 0;
        for (int i = 0; i < letras.length; i++) {
            System.out.println("O caracter " + i + " é : " + letras[i]);
            if (letras[i].equals("a") || letras[i].equals("A") || letras[i].equals("e") || letras[i].equals("E")
                    || letras[i].equals("i") || letras[i].equals("I") || letras[i].equals("o")
                    || letras[i].equals("O") || letras[i].equals("u") || letras[i].equals("U")) {
                System.out.println("O caracter " + i + " é uma vogal");
            } else {
                System.out.println("O caracter " + i + " é uma consoante");
                cont++;
            }
            System.out.println("=========================================");
        }
        System.out.println("O nº de consoantes foi de: " + cont);
    }

    public void exercicio4extra() {
        System.out.println("Digite uma palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        System.out.println("================================");
        int cont = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println("O caracter " + c + " é uma vogal");
            } else {
                System.out.println("O caracter " + c + " é uma consoante");
                cont++;
            }
            System.out.println("=========================================");
        }
        System.out.println("O nº de consoantes foi de: " + cont);
    }

    public void exercicio5() {
        int vetorA[] = new int[20];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um numero inteiro para vetorA[" + i + "]");
            vetorA[i] = sc.nextInt();
        }
        int contPar = 0;
        int contImpar = 0;
        System.out.println("================================");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contPar++;

            } else {
                contImpar++;
            }
        }
        int vetorPAR[] = new int[contPar];
        int vetorIMPAR[] = new int[contImpar];
        // distribuir os nºs nos vetores par e impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorPAR[contPar] = vetorA[i];
                contPar++;
            } else {
                vetorIMPAR[contImpar] = vetorA[i];
                contImpar++;
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("O valor do vetorA[" + i + "]= " + vetorA[i]);
        }
        System.out.println("===================================");
        for (int i = 0; i < vetorPAR.length; i++) {
            System.out.println("O valor do vetorPAR[" + i + "]= " + vetorPAR[i]);
        }
        System.out.println("=====================================");
        for (int i = 0; i < vetorIMPAR.length; i++) {
            System.out.println("O valor do vetroIMPAR[" + i + "]= " + vetorIMPAR[i]);
        }
    }

    public void exercicio6() {
        int alunos[] = new int[10];
        double notas1[] = new double[10];
        double notas2[] = new double[10];
        double notas3[] = new double[10];
        double notas4[] = new double[10];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("A nota a 1ª nota do aluno "+(i+1)+" foi de ");
            notas1[i] = sc.nextDouble();
            System.out.println("A 2ª nota foi de :");
            notas2[i] = sc.nextDouble();
            System.out.println("A 3ª nota foi de :");
            notas3[i] = sc.nextDouble();
            System.out.println("A 4ª nota foi de :");
            notas4[i] = sc.nextDouble();
        }
    }
}
