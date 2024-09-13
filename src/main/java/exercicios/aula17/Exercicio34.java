package exercicios.aula17;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            boolean ehPrimo = true;
            // Verifica divisores até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        entrada.close();
    }
}
