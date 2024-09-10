package exercicios.aula15;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = entrada.nextDouble();
        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau");
        } else {
            System.out.println("Digite o valor de b: ");
            double b = entrada.nextDouble();
            System.out.println("Digite o valor de c: ");
            double c = entrada.nextDouble();
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Delta negativo. Não possui raízes reais");
            } else if (delta == 0) {
                System.out.println("Delta igual a zero. Possui uma raiz real");
                double x1 = -b / (2 * a);
                System.out.printf("x1: %.2f%n", x1);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1: %.2f%n", x1);
                System.out.printf("x2: %.2f%n", x2);
            }
        }
        entrada.close();
    }
}
