package exercicios.aula13;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculando a area de um quadrado.");
        System.out.println("Digite o comprimento de um lado do quadrado: ");
        double lado = entrada.nextDouble();
        double area = lado * lado;
        double dobroDaArea = area * 2;
        System.out.println("O dobro da area do quadrado é: " + dobroDaArea);
    }
}
