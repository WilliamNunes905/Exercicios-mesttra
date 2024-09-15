package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais02 {
  // 2) Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
  //estado civil seja “CASADA”, solicitar o tempo de casada (anos).

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome, estadoCivil;
    char sexo;
    int tempoCasado;

    System.out.print("Informe um nome: ");
    nome = teclado.nextLine();

    teclado.nextLine();

    System.out.print("Informe um sexo: ");
    sexo = teclado.next().charAt(0);

    teclado.nextLine();

    System.out.print("Informe o estado civil: ");
    estadoCivil = teclado.nextLine();

    if (sexo == 'f' && estadoCivil.equalsIgnoreCase("CASADA")) {
      System.out.print("Quando tempo (em anos) de casado? ");
      tempoCasado = teclado.nextInt();
      System.out.printf("%s tem %d anos de casada.", nome, tempoCasado);
    }
  }
}
