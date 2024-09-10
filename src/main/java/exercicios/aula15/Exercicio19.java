package exercicios.aula15;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número menor que 1000: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero < 1000) {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            if (centenas > 0) {
                System.out.print(centenas + " " + (centenas == 1 ? "centena" : "centenas") + ", ");
            }
            if (dezenas > 0) {
                System.out.print(dezenas + " " + (dezenas == 1 ? "dezena" : "dezenas") + " e ");
            }
            if (unidades > 0) {
                System.out.print(unidades + " " + (unidades == 1 ? "unidade" : "unidades"));
            }
        } else {
            System.out.println("Número inválido. Digite um número menor que 1000.");
        }
    }
}
