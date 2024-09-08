package exercicios.aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor da sua hora de trabalho? ");
        double valorHora = entrada.nextDouble();

        System.out.println("Quantidade de horas trabalhadas no mês: ");
        double qtdHoras = entrada.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        double imposto;
        double sindicato = 0.03;  // 3%
        double fgts = 0.11;      // 11%
        double inss = 0.10;      // 10%

        if (salarioBruto <= 900) {
            imposto = 0;
        } else if (salarioBruto <= 1500) {
            imposto = 0.05;
        } else if (salarioBruto <= 2500) {
            imposto = 0.10;
        } else {
            imposto = 0.20;
        }

        double valorImposto = salarioBruto * imposto;
        double valorSindicato = salarioBruto * sindicato;
        double valorInss = salarioBruto * inss;
        double totalDescontos = valorImposto + valorSindicato + valorInss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + ") : R$ " + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR (" + String.format("%.0f", imposto * 100) + "%) : R$ " + String.format("%.2f", valorImposto));
        System.out.println("(-) INSS (" + String.format("%.0f", inss * 100) + "%) : R$ " + String.format("%.2f", valorInss));
        System.out.println("(-) Sindicato (" + String.format("%.0f", sindicato * 100) + "%) : R$ " + String.format("%.2f", valorSindicato));
        System.out.println("FGTS (" + String.format("%.0f", fgts * 100) + "%) : R$ " + String.format("%.2f", salarioBruto * fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
}
