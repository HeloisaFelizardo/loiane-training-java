package exercicios.aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: ");
        double salario = entrada.nextDouble();
        double reajuste;
        double percentual;
        double aumento;

        if(salario < 280){
            percentual = 0.20;
        } else if (salario < 700) {
            percentual = 0.15;
        } else if (salario < 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        aumento = salario * percentual;
        reajuste = salario + aumento;

        System.out.println("Salário antes do reajuste: R$ " + String.format("%.2f", salario));
        System.out.println("Percentual de aumento aplicado: " + String.format("%.0f", percentual * 100) + "%");
        System.out.println("Valor do aumento: R$ " + String.format("%.2f", aumento));
        System.out.println("Novo salário após o aumento: R$ " + String.format("%.2f", reajuste));
    }
}