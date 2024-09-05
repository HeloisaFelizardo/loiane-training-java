package exercicios.aula13;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = entrada.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area do circunferencia: " + area);
    }
}
