package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais11 {
/*
Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.

Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
*/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String pagamento;
    double preco = 250.00;

    System.out.print("Forma de pagamento: ");
    pagamento = scanner.nextLine();

    switch (pagamento) {
      case "dinheiro", "cheque" -> {
        double precoDesconto = preco * 0.10;
        preco -= precoDesconto;
        System.out.printf("Valor final com 10%% de desconto: R$%.2f%n", preco);
      }
      case "À vista no cartão de crédito" -> {
        double precoDesconto = preco * 0.15;
        preco -= precoDesconto;
        System.out.printf("Valor final com 15%% de desconto: R$%.2f%n", preco);
      }
      case "Em duas vezes no cartão de credito" -> System.out.printf("Valor final: R$%.2f%n", preco);
      case "Em mais vezes no cartão de credito" -> {
        double precoDesconto = preco * 0.10;
        preco += precoDesconto;
        System.out.printf("Preço normal de etiqueta mais juros de 10%%: R$%.2f%n", preco);
      }
    }
  }
}
