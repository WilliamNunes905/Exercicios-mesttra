package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais12 {
/*
Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
aproveitamento, usando a fórmula:
MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno,
suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a
mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E
*/

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int numeroIdentificacao;
  double nota1, nota2, nota3, mediaAproveitamento, mediaExercicio;

  System.out.print("Numero de Identificação: ");
  numeroIdentificacao = scanner.nextInt();

  System.out.print("Nota 1: ");
  nota1 = scanner.nextDouble();
  System.out.print("Nota 2: ");
  nota2 = scanner.nextDouble();
  System.out.print("Nota 3: ");
  nota3 = scanner.nextDouble();

  mediaExercicio = (nota1 + nota2+ nota3) / 3;
  mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicio) / 7;

  System.out.printf("Identificação do aluno: %d%n", numeroIdentificacao);
  System.out.printf("Notas do aluno %d, ( Nota1: %.2f, Nota2: %.2f, Nota3: %.2f )%n", numeroIdentificacao, nota1, nota2, nota3);
  System.out.printf("Média dos Exercicios: %.2f%n", mediaExercicio);
  System.out.printf("Média dos Aproveitamento: %.2f%n", mediaAproveitamento);

  if (mediaAproveitamento >= 9.0) {
    System.out.println("Nota A");
  } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
    System.out.println("Nota B");
  } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
    System.out.println("Nota C");
  } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
    System.out.println("Nota D");
    System.out.println("REPROVADO");
  } else {
    System.out.println("Nota E");
    System.out.println("REPROVADO");
  }
}
}
