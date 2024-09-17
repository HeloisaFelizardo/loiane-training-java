package exercicios.aula17;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = scan.nextInt();
        String numeroLength = String.valueOf(numero);

        if(numeroLength.length() > 0) {
            String[] numeros = numeroLength.split("");

            System.out.println("Número invertido: ");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i]);
            }
        }else {
            System.out.println("Número inválido. Por favor, insira um número inteiro positivo.");
        }

    }
}
