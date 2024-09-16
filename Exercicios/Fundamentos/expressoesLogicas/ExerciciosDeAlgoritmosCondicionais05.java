package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais05 {
/*
Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
imprimindo o resultado.
 */
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a;

    System.out.print("Informe um valor: ");
    a = teclado.nextInt();

    if (a > 0) {
      a *= 2;
      System.out.printf("Valor do dobro do numero: %d%n", a);
    } else {
      a *= 3;
      System.out.printf("Valor do triplo do numero: %d%n", a);
    }
    teclado.close();
  }
}
