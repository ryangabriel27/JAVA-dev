package CalculadoraDeDesconto;

public class CalcularDesconto {
    public void calcular() {
        System.out.println("===============");
        double precoDoProduto;
        precoDoProduto = 200;
        System.out.println("O preço do produto é de " + precoDoProduto + " reais");
        double percentualDesconto = 10.0;
        percentualDesconto = 20;
        System.out.println("O desconto será de " + percentualDesconto + " %");
        double desconto = precoDoProduto * percentualDesconto / 100;
        double precoComDesconto = precoDoProduto - desconto;
        System.out.println("O preço do produto com desconto é de " + precoComDesconto + " reais");
        System.out.println("Fim!");
        System.out.println("===========");


    }
    public void calcular30() {
        System.out.println("===============");
        double precoDoProduto;
        precoDoProduto = 200;
        System.out.println("O preço do produto é de " + precoDoProduto + " reais");
        double percentualDesconto = 10.0;
        percentualDesconto = 30;
        System.out.println("O desconto será de " + percentualDesconto + " %");
        double desconto = precoDoProduto * percentualDesconto / 100;
        double precoComDesconto = precoDoProduto - desconto;
        System.out.println("O preço do produto com desconto é de " + precoComDesconto + " reais");
        System.out.println("Fim!");
        System.out.println("===========");
        
    }

}
