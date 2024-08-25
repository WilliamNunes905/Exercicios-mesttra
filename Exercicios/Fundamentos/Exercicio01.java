package Exercicios.Fundamentos;

import java.util.Scanner;

/*
Exercício 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo.
Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.

|------- Valor de Entrada -------|
("Informe a frente do terreno (em metros): ")
("Informe a lateral do terreno (em metros): ")
("Informe o valor cobrado por metro quadrado: ")
 */

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
