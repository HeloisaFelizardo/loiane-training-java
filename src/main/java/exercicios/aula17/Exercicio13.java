package exercicios.aula17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base:");
        int base = entrada.nextInt();

        System.out.println("Digite o expoente:");
        int expoente = entrada.nextInt();

        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

        entrada.close();
    }
}
