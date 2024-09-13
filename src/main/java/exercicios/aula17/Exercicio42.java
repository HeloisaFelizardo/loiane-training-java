package exercicios.aula17;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int numeros0a25 = 0;
        int numeros26a50 = 0;
        int numeros51a75 = 0;
        int numeros76a100 = 0;

        do{
            System.out.println("Digite um número positivo (Digite um número negativo para sair): ");
            numero = entrada.nextInt();
            if (numero >= 0 && numero <= 25) {
                numeros0a25++;
            } else if (numero >= 26 && numero <= 50) {
                numeros26a50++;
            } else if (numero >= 51 && numero <= 75) {
                numeros51a75++;
            } else if (numero >= 76 && numero <= 100) {
                numeros76a100++;
            }
        }while (numero >= 0);

        System.out.println("Números entre 0 e 25: " + numeros0a25);
        System.out.println("Números entre 26 e 50: " + numeros26a50);
        System.out.println("Números entre 51 e 75: " + numeros51a75);
        System.out.println("Números entre 76 e 100: " + numeros76a100);

        entrada.close();
    }
}
