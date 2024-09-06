package exercicios.aula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu sexo (M) Masculino ou (F) Feminino: ");
        String sexo = entrada.nextLine().trim().toUpperCase();

        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = entrada.nextDouble();

        double pesoIdealHomem = (72.7 * altura) - 58;
        double pesoIdealMulher = (62.1 * altura) - 44.7;

        if (sexo.equals("M")) {
            if (peso > pesoIdealHomem) {
                System.out.printf("Você está acima do peso ideal: %.2f kg%n", peso);
            } else if (peso < pesoIdealHomem) {
                System.out.printf("Você está abaixo do peso ideal: %.2f kg%n", peso);
            } else {
                System.out.printf("Você está no peso ideal: %.2f kg%n", peso);
            }
        } else if (sexo.equals("F")) {
            if (peso > pesoIdealMulher) {
                System.out.printf("Você está acima do peso ideal: %.2f kg%n", peso);
            } else if (peso < pesoIdealMulher) {
                System.out.printf("Você está abaixo do peso ideal: %.2f kg%n", peso);
            } else {
                System.out.printf("Você está no peso ideal: %.2f kg%n", peso);
            }
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
        }

        entrada.close();
    }
}
