package exercicios.aula17;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numero = entrada.nextInt();
        System.out.print("Começar por: ");
        int comeco = entrada.nextInt();
        System.out.print("Terminar em: ");
        int fim = entrada.nextInt();

        System.out.println("Vou montar a tabuada de " + numero + " começando em " + comeco + " e terminando em " + fim + ":");
        for (int i = comeco; i <= fim; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entrada.close();
    }
}
