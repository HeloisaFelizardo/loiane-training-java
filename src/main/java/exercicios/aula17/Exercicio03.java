package exercicios.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double salario = 0;
        char sexo = ' ';
        String estadoCivil = " ";

        // Validação do nome
        while (true) {
            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();

            if (nome == null || nome.isEmpty()) {
                System.out.println("A string é inválida (nula ou vazia).");
            } else if (nome.length() < 3 ) {
                System.out.println("A string é inválida. O tamanho deve ser maior que 3 caracteres.");
            } else if (!nome.matches("[a-zA-Z]+")) {
                System.out.println("A string é inválida. Deve conter apenas letras.");
            } else {
                break;
            }
        }

        // Validação da idade
        while (true) {
            try {
                System.out.println("Digite a idade: ");
                idade = entrada.nextInt();
                if (idade < 0 || idade > 150) {
                    System.out.println("Idade inválida. Digite um valor entre 0 e 150.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                entrada.next(); // Limpa a entrada inválida
            }
        }

        // Limpar buffer antes de chamar nextLine() após nextInt() ou nextDouble()
        entrada.nextLine();

        // Validação do salário
        while (true) {
            try {
                System.out.println("Digite o salário: ");
                salario = entrada.nextDouble();
                if (salario < 0) {
                    System.out.println("Salário inválido. Digite um valor maior que zero.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                entrada.next(); // Limpa a entrada inválida
            }
        }

        // Limpar buffer antes de chamar nextLine() após nextInt() ou nextDouble()
        entrada.nextLine();

        // Validação do sexo
        while (true) {
            System.out.println("Digite o sexo (F/M): ");
            sexo = entrada.next().toUpperCase().charAt(0);

            if (sexo == 'F' || sexo == 'M') {
                break;
            } else {
                System.out.println("Sexo inválido. Digite F para feminino ou M para masculino.");
            }
        }

        // Validação do estado civil
        while (true) {
            System.out.println("Digite o estado civil (S/C/V/D): ");
            estadoCivil = entrada.next().toUpperCase();

            if (estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")) {
                switch (estadoCivil) {
                    case "S":
                        estadoCivil = "Solteiro";
                        break;
                    case "C":
                        estadoCivil = "Casado";
                        break;
                    case "V":
                        estadoCivil = "Viuvo";
                        break;
                    case "D":
                        estadoCivil = "Divorciado";
                        break;
                }
                break;
            } else {
                System.out.println("Estado civil inválido. Digite S para solteiro, C para casado, V para viúvo ou D para divorciado.");
            }
        }

        // Exibe as informações
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + String.format("%.2f", salario));
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        entrada.close();
    }
}
