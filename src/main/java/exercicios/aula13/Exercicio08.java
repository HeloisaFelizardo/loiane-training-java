package exercicios.aula13;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        double valorPorHora = entrada.nextDouble();
        System.out.println("Quantas horas trabalhadas no mês?");
        double horasTrabalhadas = entrada.nextDouble();
        double totalSalario = valorPorHora * horasTrabalhadas;
        System.out.printf("Salário total do mês: R$ %.2f%n", totalSalario);
    }
}
