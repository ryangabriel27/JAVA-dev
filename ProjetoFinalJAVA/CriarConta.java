package ProjetoFinalJAVA;

import java.util.Scanner;

public class CriarConta extends Pessoas {

    Scanner sc = new Scanner(System.in);
    //atributos

    //método
    public void CriarContaJuridica() {
        System.out.println("Você escolheu criar uma conta Jurídica, então vamos lá");

        System.out.println("Primeiro , Digite o seu nome:");
        nome = sc.next();

        System.out.println();

    }

    public void CriarContaFisica() {
    
        
    }
}
