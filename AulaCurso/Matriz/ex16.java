package Matriz;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
/*Faca um programa para corrigir uma prova com 10 questoes de multipla escolha (a, b, c, d ou e), em uma turma com 3 alunos. 
Cada questao vale 1 ponto. 
Leia o gabarito, e para cada aluno leia sua matricula (numero inteiro) e suas respostas. 
Calcule e escreva:
Para cada aluno, escreva sua matrıcula, suas respostas, e sua nota. O percentual de aprovacao, assumindo media 7.0 */

        Scanner scanner = new Scanner(System.in);

        int coluna = 10;
        int linha = 3;
        int soma = 0;
        int qtdDeAprovados = 0;
        int media = 0;

        char[][] resposta = new char[linha][coluna];

        int[] matricula = new int[linha];
        int[] resultado = new int[linha];
        //float[] media = new float[linha];
        char[] gabarito = new char[coluna];   //{'a', 'b', 'c', 'e', 'b', 'e', 'c', 'e', 'a', 'd'};

        System.out.println("Qual o gabarito da prova (a,b,c, d ou e)?");
        for (int x = 0; x < gabarito.length; x++) {
        	System.out.print((x + 1) + "ª resposta: ");
            String g = scanner.nextLine();
            gabarito[x] = g.charAt(0);
        }
        System.out.println("");
        //MATRIZ PARA RECEBER AS NOTAS
        for (int x = 0; x < resposta.length; x++) {
            System.out.print((x + 1) + "º Aluno - Digite sua matricula: ");
            matricula[x] = scanner.nextInt();
            scanner.nextLine();
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print("Informe sua " + (y + 1) + "ª resposta: ");
                String l = scanner.nextLine();
                resposta[x][y] = l.charAt(0);
            }
            System.out.println("");
        }

        //MATRIZ PARA FAZER A CONPARAÇÃO DAS NOTAS DIGITADAS COM O GABARITO E CALCULA O PERCENTUAL DE APROVADOS
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[0].length; y++) {
                if (resposta[x][y] == gabarito[y]) {
                    soma++;
                    resultado[x] = soma;
                }
            }
            if (resultado[x] >= 7) {
                qtdDeAprovados++;
            }
            media = (100*qtdDeAprovados)/coluna;
            soma = 0;
        }

        System.out.println();
        System.out.println("Gabarito Alunos");
        System.out.println();
        for (int x = 0; x < resposta.length; x++) {

            System.out.print("Maticula " + matricula[x] + ": ");
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print(resposta[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        //MOSTRA O VETOR RESULTADO COM A PONTUAÇÃO DE CADA ALUNO.
        System.out.println();
        for (int x = 0; x < resultado.length; x++) {
            System.out.println("A nota do aluno matricula: " + matricula[x] + " foi de " + resultado[x] +" pontos.");
        }
        System.out.println("");
        System.out.println("O percentual de aprovação assumindo media 7.0 é de: " + media+"%");
        System.out.println();
    }
}