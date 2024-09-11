package exercicios.aula17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = entrada.nextInt();
        int fatorial = 1;

        System.out.print(n + "! = ");
        for (int i = n; i > 0; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + fatorial);
    }
}
