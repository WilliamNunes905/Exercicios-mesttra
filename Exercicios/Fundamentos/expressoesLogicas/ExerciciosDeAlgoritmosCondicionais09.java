package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais09 {
/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
calcule seu peso ideal, utilizando as seguintes fórmulas:
● para homens: (72.7 * h) – 58;
● para mulheres: (62.1 * h) – 44.7.
 */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double altura;
    String sexo;

    System.out.print("Digite o seu sexo: ");
    sexo = scanner.nextLine();

    System.out.print("Digite sua altura: ");
    altura = scanner.nextDouble();

    if (sexo.equals("masculino")) {
      double pesoIdealHomen = (72.7 * altura) - 58;
      System.out.printf("O peso ideal para você (Homen) é: %.2f%n", pesoIdealHomen);
    } else {
      double pesoIdealMulher = (62.1 * altura) - 44.7;
      System.out.printf("O peso ideal para você (Mulher) é: %.2f%n", pesoIdealMulher);
    }
  }
}
