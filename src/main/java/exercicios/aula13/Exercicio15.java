package exercicios.aula13;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double ganhoPorHora = entrada.nextDouble();

        System.out.println("Qual é o número de horas trabalhadas no mês? ");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadas;
        double imposto = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = imposto + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salário Bruto: %.2f R$%n", salarioBruto);
        System.out.printf("Valor do INSS: %.2f R$%n", inss);
        System.out.printf("Salário Liquido: %.2f R$%n", salarioLiquido);
    }
}
