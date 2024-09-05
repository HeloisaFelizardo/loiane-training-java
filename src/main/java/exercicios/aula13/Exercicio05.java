package exercicios.aula13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor em metros: ");
        double metros = entrada.nextDouble();
        double centimetros = metros * 100;
        System.out.println("O valor em centimetros de " + metros + " metros é " + centimetros + " centimetros.");
    }
}
