package exercicios.aula15;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        entrada.close();
        String letra = entrada.nextLine().trim().toUpperCase();

        if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
            if(letra.equals("F")){
                System.out.println("Feminino");
            }else if(letra.equals("M")){
                System.out.println("Masculino");
            }else{
                System.out.println("Sexo inválido");
            }
        }else {
            System.out.println("Entrada inválida. Por favor, digite apenas uma letra.");
        }
    }
}
