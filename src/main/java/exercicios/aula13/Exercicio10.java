package exercicios.aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um grau celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C em farenheit são: " + fahrenheit + "°F");
    }
}
