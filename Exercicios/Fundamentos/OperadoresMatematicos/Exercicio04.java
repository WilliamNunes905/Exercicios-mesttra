package Exercicios.Fundamentos.OperadoresMatematicos;

import java.util.Scanner;

/*
Exercício 04: Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 11% de INSS e 8% de FGTS.
Imprima o salário inicial,o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos (INSS+FGTS).

|------- Valor de Entrada -------|
("Informe o sálario: ")
("Sálario Inicial: ")
("Sálario com reajuste: ")
("Desconto 11% INSS: ")
("Desconto 8% FGTS: ")
("Total Descontos INSS+FGTS: ")
("Sálario final: ")
 */

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o sálario: ");
        double salario = teclado.nextFloat();

        System.out.println("Sálario Inicial: " + salario);

        double aumento = salario * 0.15;

        double salarioComAumento = salario + aumento;
        System.out.println("Sálario com reajuste: " + salarioComAumento);

        double descontoInss = salarioComAumento * 0.11;
        double descontoFgts = salarioComAumento * 0.08;
        double descontoTotal = descontoInss + descontoFgts;

        System.out.println("Desconto 11% INSS: " + descontoInss);
        System.out.println("Desconto 8% FGTS: " + descontoFgts);
        System.out.printf("Total Descontos INSS+FGTS: %.2f \n", descontoTotal);

        System.out.printf("Sálario final: %.2f", + (salarioComAumento - descontoTotal));
    }
}
