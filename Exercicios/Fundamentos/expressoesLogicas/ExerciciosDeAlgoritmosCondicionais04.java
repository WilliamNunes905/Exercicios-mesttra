package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais04 {
/*  4) Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
*/
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a, b;
    double c;

    System.out.print("Digite um valor inteiro para A: ");
    a = teclado.nextInt();

    System.out.print("Digite um valor inteiro para B: ");
    b = teclado.nextInt();

    if (a == b) {
      c = a + b;
    } else {
      c = a * b;
    }
    System.out.printf("Valor de C: %.2f%n", c);
    teclado.close();
  }
}
