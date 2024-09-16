package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais06 {
// 6) Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são VERDADEIROS ou FALSOS.
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    boolean a, b;

    System.out.print("Informe um boolean: ");
    a = teclado.nextBoolean();

    System.out.print("Informe um boolean: ");
    b = teclado.nextBoolean();

    if (a && b) {
      System.out.println("Ambos são VERDADEIROS");
    } else {
      System.out.println("Um dos boolean são FALSOS");
    }
    teclado.close();
  }
}
