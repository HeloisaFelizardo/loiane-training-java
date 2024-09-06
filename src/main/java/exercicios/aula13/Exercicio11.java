package exercicios.aula13;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois numero inteiros e um numero real:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        double numero3 = entrada.nextDouble();

        int produto = (numero1 * 2) * (numero2 / 2);
        System.out.println("a. Produto do dobro do primeiro com o metade do segundo: " + produto);

        double soma = (numero1 * 3) + numero3;
        System.out.println("b. A soma do triplo do primeiro com o terceiro: " + soma);

        double cubo = Math.pow(numero3, 3);
        System.out.println("c. O terceiro elevado ao cubo: " + cubo);

        entrada.close();
    }
}
