package exercicios.aula13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a sua altura? ");
        double altura = entrada.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

        entrada.close();
    }
}
