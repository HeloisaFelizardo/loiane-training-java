package exercicios.aula15;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        entrada.close();

        int maior, meio, menor;

        // Comparando para encontrar o maior, o meio e o menor
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        // Exibindo os números em ordem decrescente
        System.out.println("Os números em ordem decrescente são: " + maior + ", " + meio + ", " + menor);
    }
}
