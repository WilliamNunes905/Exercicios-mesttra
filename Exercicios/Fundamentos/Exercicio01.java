package Exercicios.Fundamentos;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a frente do terreno (em metros): ");
        double frente = scanner.nextDouble();

        System.out.print("Informe a lateral do terreno (em metros): ");
        double lateral = scanner.nextDouble();

        System.out.print("Informe o valor cobrado por metro quadrado: ");
        double valorMetroQuadrado = scanner.nextDouble();

        double area = frente * lateral;

        double valorVenda = area * valorMetroQuadrado;

        System.out.println("Área do terreno: " + area + " metros quadrados");
        System.out.println("Valor de venda do terreno: R$ " + valorVenda);

        scanner.close();
    }
}
