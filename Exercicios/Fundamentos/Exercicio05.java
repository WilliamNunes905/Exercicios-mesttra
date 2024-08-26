package Exercicios.Fundamentos;

import java.util.Scanner;

/*
Exercício 05: A granja Frangotech possui um controle automatizado de cada frango da sua produção.
No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50,
faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser informado pelo usuário.

|------- Valor de Entrada -------|
("Digite a QTDE de frangos: ")

Resultado esperado:
("O valor total para identificar os frangos e: ")
 */


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a QTDE de frangos: ");
        int frangos = teclado.nextInt();
        double valorDoChipEanel = 4.00 + (3.50 + 3.50);
        double valorTotalDeIdentificacao = frangos * valorDoChipEanel;

        System.out.println("O valor total para identificar os frangos e: " + valorTotalDeIdentificacao);
    }
}
