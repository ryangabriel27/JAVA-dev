package ProjetoFinalJAVA;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class App {
    public static void main(String[] args) {

        CriarConta conta[] = new CriarConta[1000];
        Scanner sc = new Scanner(System.in);

        boolean agencia = true;

        while(agencia) {

           System.out.println("Bem - Vindo !!!");
           System.out.println(" O que você deseja fazer "
           +"\n1 : Criar uma nova conta"
           +"\n2 : Acessar uma conta existente");
            int escolha = sc.nextInt();

            if ( escolha == 1 ) {
                System.out.println("Você escolheu criar uma conta ");

                System.out.println("Agora , escolha o tipo de conta que deseja criar: "
                +"\n1: Pessoa Jurídica"
                +"\n2: Pessoa Física");



            } else if ( escolha == 2) {
               System.out.println("Você escolheu acessar uma conta existente ");
            } else {
             System.out.println("Digite um número válido!");
            }


         
        }
    }
}
