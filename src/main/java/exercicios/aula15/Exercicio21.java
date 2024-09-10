package exercicios.aula15;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o valor do saque? ");
        int saque = entrada.nextInt();
        entrada.close();

        // Variáveis para contar as notas
        int notas100 = saque / 100;
        saque %= 100; // Resto após retirar as notas de 100

        int notas50 = saque / 50;
        saque %= 50; // Resto após retirar as notas de 50

        int notas10 = saque / 10;
        saque %= 10; // Resto após retirar as notas de 10

        int notas5 = saque / 5;
        saque %= 5; // Resto após retirar as notas de 5

        int notas1 = saque; // O que sobrar são notas de 1

        // Exibir as notas
        if (notas100 > 0) {
            System.out.println(notas100 + " " + (notas100 == 1 ? "nota de 100" : "notas de 100"));
        }
        if (notas50 > 0) {
            System.out.println(notas50 + " " + "nota de 50");
        }
        if (notas10 > 0) {
            System.out.println(notas10 + " " + (notas10 == 1 ? "nota de 10" : "notas de 10"));
        }
        if (notas5 > 0) {
            System.out.println(notas5 + " " + "nota de 5");
        }
        if (notas1 > 0) {
            System.out.println(notas1 + " " + (notas1 == 1 ? "nota de 1" : "notas de 1"));
        }
    }
}
