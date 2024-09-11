package exercicios.aula17;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = entrada.nextInt();

        // Verifica se o número é menor ou igual a 1
        if (n <= 1) {
            System.out.println(n + " não é primo.");
        } else {
            boolean primo = true;

            // Verifica divisibilidade por números de 2 até a raiz quadrada de n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(n + " é primo.");
            } else {
                System.out.println(n + " não é primo.");
                System.out.println(n + " é divisivel por: ");
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.println(i);
                    }
                }
            }
        }

        entrada.close(); // Fecha o Scanner
    }
}
