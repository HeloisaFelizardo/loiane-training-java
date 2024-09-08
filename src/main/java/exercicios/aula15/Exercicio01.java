package exercicios.aula15;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}

