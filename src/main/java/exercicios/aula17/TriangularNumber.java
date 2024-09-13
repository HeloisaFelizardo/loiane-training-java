package exercicios.aula17;

import java.util.Scanner;

public class TriangularNumber {

    // Função recursiva para calcular o N-ésimo número triangular
    public static int triangularNumber(int n) {
        // Base case: T(1) = 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: T(n) = n + T(n-1)
        return n + triangularNumber(n - 1);
    }

    // Função recursiva para imprimir o triângulo de tamanho n
    public static void printTriangle(int n) {
        printTriangleHelper(n, 1);
    }

    private static void printTriangleHelper(int n, int currentRow) {
        // Base case: se currentRow > n, termine a recursão
        if (currentRow > n) {
            return;
        }

        // Imprimir espaços antes dos números
        for (int i = 0; i < n - currentRow; i++) {
            System.out.print(" ");
        }

        // Imprimir números na linha atual
        for (int i = 0; i < currentRow; i++) {
            System.out.print("* ");
        }

        System.out.println(); // Mover para a próxima linha

        // Recursive case: imprimir a próxima linha
        printTriangleHelper(n, currentRow + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber o número natural N
        System.out.print("Digite um número natural N: ");
        int N = scanner.nextInt();

        // Calcular o N-ésimo número triangular
        int triangularNumber = triangularNumber(N);
        System.out.println("O " + N + "-ésimo número triangular é: " + triangularNumber);

        // Imprimir o triângulo correspondente
        System.out.println("O triângulo equivalente é:");
        printTriangle(N);

        scanner.close();
    }
}
