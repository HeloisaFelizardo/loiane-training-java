package exercicios.aula15;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");
        System.out.println("e - Sair");
        char opcao = entrada.next().charAt(0);

        // Variável para armazenar o resultado
        double resultado = 0;
        boolean operacaoValida = true;

        // Executa a operação de acordo com a escolha do usuário
        switch (opcao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                // Verifica se o divisor é zero para evitar divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            case 'e':
                System.out.println("Saindo...");
                entrada.close();
                return; // Encerra o programa imediatamente
            default:
                System.out.println("Opção inválida.");
                operacaoValida = false;
                break;
        }

        // Se a operação foi válida, mostra o resultado e verifica suas propriedades
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
            if (resultado % 2 == 0) {
                System.out.println("O resultado da operação é par.");
            } else {
                System.out.println("O resultado da operação é ímpar.");
            }

            if (resultado < 0) {
                System.out.println("O resultado da operação é negativo.");
            } else {
                System.out.println("O resultado da operação é positivo.");
            }

            if (resultado == Math.floor(resultado)) {
                System.out.println("O resultado da operação é inteiro.");
            } else {
                System.out.println("O resultado da operação é decimal.");
            }
        }

        entrada.close();
    }
}
