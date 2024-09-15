package Exercicios.Fundamentos.OperadoresMatematicos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Exercício 06: A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo,
uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas,
e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer,
e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

|------- Valor de Entrada -------|
("Digite a quantidade de sanduiches: ")

|------- Resultado esperado: -------|
("Para produzir ??? sanduiches serão necessarios: ")
("??? kgs de mussarela")
("??? kgs de presunto")
("??? kgs de hamburger")
*/

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de sanduiches: ");
        int qtdSanduiches = teclado.nextInt();

        System.out.println("Para produzir " + qtdSanduiches + " sanduiches serão necessarios: ");
        double qtdMussarela = qtdSanduiches * 2 * 50;
        double qtdPresunto = qtdSanduiches * 50;
        double qtdHamburger = qtdSanduiches * 120;

        double totalQueijoKg = qtdMussarela / 1000.0;
        double totalPresuntoKg = qtdPresunto / 1000.0;
        double totalHamburguerKg = qtdHamburger / 1000.0;

        System.out.println(dc.format(totalQueijoKg) + " kgs de mussarela");
        System.out.println(dc.format(totalPresuntoKg) + " kgs de presunto");
        System.out.println(dc.format(totalHamburguerKg) + " kgs de hamburger");

        teclado.close();
    }
}
