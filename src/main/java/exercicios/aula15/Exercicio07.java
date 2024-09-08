package exercicios.aula15;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        entrada.close();

        int maior;
        int menor;

        // Verificando o maior número
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        // Verificando o menor número
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
