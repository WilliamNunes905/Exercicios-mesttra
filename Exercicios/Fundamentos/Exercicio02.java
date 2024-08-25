package Exercicios.Fundamentos;

import java.util.Scanner;

/*
Exercício 02: Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário,
calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.

|------- Valor de Entrada -------|
("Informe o valor do salario minimo: ")
("Informe o valor do salario do funcionario: ")
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do salario minimo: ");
        double salarioMinimo = teclado.nextDouble();

        System.out.print("Informe o valor do salario do funcionario: ");
        double salarioDoFuncionario = teclado.nextDouble();

        double calcularSalario = salarioDoFuncionario / salarioMinimo;

        System.out.printf("O funcionario recebe %.2f salarios minimos!", calcularSalario);
    }
}
