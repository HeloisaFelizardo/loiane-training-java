package exercicios.aula17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = -1;

        while (numero < 0 || numero > 10) {
            try {
                System.out.println("Digite um número entre 0 e 10: ");
                numero = entrada.nextInt();

                if (numero < 0 || numero > 10) {
                    System.out.println("Número inválido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                entrada.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("Número válido: " + numero);
        entrada.close(); // Fechar o Scanner após o uso
    }
}

