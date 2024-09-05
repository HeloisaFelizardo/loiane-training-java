package exercicios.aula13;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }
}
