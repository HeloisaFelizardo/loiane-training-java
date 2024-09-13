package exercicios.aula17;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("Números primos entre 1 e " + numero + ":");

        for (int i = 2; i <= numero; i++) { // Começa de 2, pois 1 não é primo
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }

        entrada.close();
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
