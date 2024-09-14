package exercicios.aula17;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] gabarito = new String[10];
        // Gabarito já definido
        //String[] gabarito = {"C", "C", "B", "C", "C", "C", "C", "D", "B", "A"};
        int totalDeAlunos = 0;
        int maiorAcerto = 0;
        int menorAcerto = Integer.MAX_VALUE; // Inicializa com o maior valor possível
        int somaNotas = 0;

        // O professor insere o gabarito
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o gabarito da questão " + (i + 1) + ": ");
            gabarito[i] = scan.next().toUpperCase();
        }

        String continuar;
        String resposta;
        do {
            int pontos = 0;
            // O aluno insere suas respostas
           /* for (int i = 0; i < 10; i++) {
                System.out.println("Qual é a resposta da questão " + (i + 1) + ": ");

                String resposta = scan.next().toUpperCase();

                if (resposta.equals(gabarito[i])) {
                    pontos++;
                }
            }*/

            // Perguntas para o aluno
            System.out.println("Responda o quiz:");

            System.out.println("1. Qual é a capital da França?");
            System.out.println("a) Berlim\nb) Madrid\nc) Paris\nd) Lisboa\ne) Roma");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[0])) pontos++;

            System.out.println("2. Qual é o maior oceano do mundo?");
            System.out.println("a) Oceano Atlântico\nb) Oceano Indico\nc) Oceano Pacífico\nd) Oceano Artico\ne) Oceano Antártico");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[1])) pontos++;

            System.out.println("3. Quem foi o primeiro homem a pisar na Lua?");
            System.out.println("a) Yuri Gagarin\nb) Neil Armstrong\nc) Buzz Aldrin\nd) Alan Shepard\ne) John Glenn");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[2])) pontos++;

            System.out.println("4. Qual é o elemento químico mais abundante no universo?");
            System.out.println("a) Oxigênio\nb) Hélio\nc) Hidrogênio\nd) Carbono\ne) Nitrogênio");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[3])) pontos++;

            System.out.println("5. Quantos continentes existem na Terra?");
            System.out.println("a) Cinco\nb) Seis\nc) Sete\nd) Oito\ne) Quatro");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[4])) pontos++;

            System.out.println("6. Em que ano terminou a Segunda Guerra Mundial?");
            System.out.println("a) 1939\nb) 1941\nc) 1945\nd) 1949\ne) 1955");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[5])) pontos++;

            System.out.println("7. Quem pintou o quadro 'A Monalisa'?");
            System.out.println("a) Pablo Picasso\nb) Michelangelo\nc) Leonardo da Vinci\nd) Vincent van Gogh\ne) Salvador Dalí");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[6])) pontos++;

            System.out.println("8. Qual é o maior planeta do sistema solar?");
            System.out.println("a) Terra\nb) Saturno\nc) Urano\nd) Júpiter\ne) Marte");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[7])) pontos++;

            System.out.println("9. Qual foi o país que inventou o papel?");
            System.out.println("a) Grécia\nb) China\nc) Egito\nd) Japão\ne) India");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[8])) pontos++;

            System.out.println("10. Quantos graus tem um triângulo equilátero?");
            System.out.println("a) 180\nb) 90\nc) 360\nd) 120\ne) 60");
            System.out.print("Sua resposta: ");
            resposta = scan.next().toUpperCase();
            if (resposta.equals(gabarito[9])) pontos++;

            // Atualiza maior e menor acerto
            if (pontos > maiorAcerto) {
                maiorAcerto = pontos;
            }

            if (pontos < menorAcerto) {
                menorAcerto = pontos;
            }

            // Soma a nota do aluno ao total
            somaNotas += pontos;
            totalDeAlunos++;

            // Pergunta se outro aluno vai utilizar o sistema
            do {
                System.out.println("Outro aluno vai utilizar o sistema? (s/n)");
                continuar = scan.next().toUpperCase();
            } while (!continuar.equals("S") && !continuar.equals("N"));

        } while (!continuar.equals("N"));

        // Calcula a média da turma
        double mediaNotasDaTurma = (double) somaNotas / totalDeAlunos;

        // Exibe resultados
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalDeAlunos);
        System.out.println("Média de notas da turma: " + String.format("%.2f", mediaNotasDaTurma));

        scan.close();
    }
}