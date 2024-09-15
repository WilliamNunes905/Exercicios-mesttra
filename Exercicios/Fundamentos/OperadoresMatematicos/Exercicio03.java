package Exercicios.Fundamentos.OperadoresMatematicos;

/*
Exercício 03: Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
O usuário devera informar a quantidade de cavalos adquiridos.

|------- Valor de Entrada -------|
("Informe a quantidade de cavalos: ")
("Informe o valor de cada ferredura R$: ")

|------- Valor de Saida -------|
("A quantidade de ferradura necessárias: ")
("Valor total para a compra das ferraduras: R$ ")
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de cavalos: ");
        int quantidadeDeCavalos = teclado.nextInt();

        System.out.print("Informe o valor de cada ferredura R$: ");
        float valorDaFerradura = teclado.nextFloat();

        int quantidadeDeFerradura = quantidadeDeCavalos * 4;
        System.out.println("A quantidade de ferradura necessárias: " + quantidadeDeFerradura);

        float valorTotal = quantidadeDeFerradura * valorDaFerradura;
        System.out.println("Valor total para a compra das ferraduras: R$ " + valorTotal);
    }
}
