package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExercicioDeAlgoritmosCondicionais01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a, b, c;

    // 1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.
    System.out.println("Valor A");
    a = teclado.nextInt();
    System.out.println("Valor B");
    b = teclado.nextInt();
    System.out.println("Valor C");
    c = teclado.nextInt();

    int soma = a + b;

    if (soma < c) {
      System.out.println("É menor");
    }
    teclado.close();
  }
}
