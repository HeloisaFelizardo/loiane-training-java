package exercicios.aula15;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma data no formato (dd/mm/aaaa):");
        String data = entrada.nextLine();
        entrada.close();

        // Verifica se a entrada está no formato correto
        String[] partes = data.split("/");
        if (partes.length != 3) {
            System.out.println("Formato de data inválido. Utilize o formato dd/mm/aaaa.");
            return;
        }

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            if (dataValida(dia, mes, ano)) {
                System.out.println("Data válida");
            } else {
                System.out.println("Data inválida");
            }

        } catch (NumberFormatException e) {
            System.out.println("Data inválida. Certifique-se de usar apenas números.");
        }
    }

    // Método para verificar se o ano é bissexto
    public static boolean anoBissexto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    // Método para verificar se a data é válida
    public static boolean dataValida(int dia, int mes, int ano) {
        if (ano < 0) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        // Verifica fevereiro
        if (mes == 2) {
            if (anoBissexto(ano)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }

        // Verifica meses com 30 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }

        return true; // Para os meses com 31 dias
    }
}
