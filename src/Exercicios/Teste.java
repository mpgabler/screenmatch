package Exercicios;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.println("Digite um valor em Dolar para converter para Real: ");
        double valorEmDolar = scanner.nextDouble();

        System.out.println("O valor convertido em Real é: ");
        conversor.converterDolarParaReal(valorEmDolar);

        scanner.close();
    }
}
