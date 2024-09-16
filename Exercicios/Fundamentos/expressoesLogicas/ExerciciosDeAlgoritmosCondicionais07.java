package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais07 {
  // Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double entrada;

    System.out.print("Digite um valor: ");
    entrada = teclado.nextDouble();

    if (entrada % 2 == 0) {
      entrada += 5;
    } else {
      entrada += 8;
    }
    System.out.printf("Resultado: %.2f%n", entrada);
    teclado.close();
  }
}
