package exercicios.aula13;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Farenheit: ");
        double farenheit = entrada.nextDouble();
        double celsius = (5 * (farenheit - 32) / 9);
        System.out.println("Temperatura em graus celsius: " + celsius + "º C");
    }
}
