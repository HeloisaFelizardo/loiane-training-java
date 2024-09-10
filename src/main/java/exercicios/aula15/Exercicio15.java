package exercicios.aula15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os tres lados de um triângulo:");
        double lado1 = entrada.nextDouble();
        double lado2 = entrada.nextDouble();
        double lado3 = entrada.nextDouble();

        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if(lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
        entrada.close();
    }
}
