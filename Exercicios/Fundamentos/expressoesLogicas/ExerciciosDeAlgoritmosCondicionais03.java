package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais03 {
// 3) Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a, b;

    System.out.print("Informe o valor (Inteiro) de A: ");
    a = teclado.nextInt();

    System.out.print("Informe o valor (Inteiro) de B: ");
    b = teclado.nextInt();

    if (a % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("ÍMPAR");
    }
  }
}
