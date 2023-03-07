package CalculadoraVelocidade2;

import java.util.Scanner;

public class CalculadoraVelocidade {

    Scanner sc = new Scanner(System.in);

    public void calcular() {
        System.out.println("Informe a disância percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("Informe o tempo gasto");
        double tempoGasto = sc.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("A velocidade média é " + velocidadeMedia + " Km/h");
    }

    public void destino() {
        System.out.println("Informe o local de origem");
        String origem = sc.next();
        System.out.println("Informe o o seu destino");
        String destino = sc.next();
        System.out.println("Então você irá de " + origem + " até " + destino);
    }
}
