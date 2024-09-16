package Exercicios.Fundamentos.expressoesLogicas;

import java.util.Scanner;

public class ExerciciosDeAlgoritmosCondicionais10 {
/*
O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
com a tabela abaixo.
*/

 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   double altura;
   double peso;

   System.out.print("Digite sua altura: ");
   altura = scanner.nextDouble();

   System.out.print("Digite seu peso: ");
   peso = scanner.nextDouble();

   double imc = peso / Math.pow(altura, 2);

   if (imc <= 18.5) {
     System.out.println("Sua condição é: Abaixo do peso");
   } else if (imc > 18.5 && imc <= 25) {
     System.out.println("Sua condição é: Peso normal");
   } else if (imc > 25 && imc <= 30) {
     System.out.println("Sua condição é: Acima do peso");
   } else {
     System.out.println("Sua condição é: Obeso");
   }
   System.out.printf("Seu IMC: %.2f%n", imc);
 }
}
