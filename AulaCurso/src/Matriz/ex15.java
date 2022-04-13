package Matriz;

import java.util.Locale;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
//Leia uma matriz 5x10 que se refere respostas de 10 questoes de multipla escolha, referentes a 5 alunos. 
//Leia tambem um vetor de 10 posicoes contendo o gabarito de respostas que podem ser a, b, c ou d.
//Seu programa devera comparar as respostas de cada candidato com o gabarito e emitir um vetor denominado resultado, 
//contendo a pontuacao correspondente a cada aluno. 
		    
		Scanner scanner = new Scanner(System.in);

        int colunas = 10;
        int linhas = 5;
        int soma = 0;

        char[][] resposta = new char[linhas][colunas];
        char[] gabarito = {'a', 'b', 'c', 'd', 'b', 'b', 'c', 'c', 'a', 'd'};
        int[] resultado = new int[linhas];

        System.out.println("Responda (a,b,c ou d):");
        System.out.println("");
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
            	System.out.print((x + 1) + "º Aluno - " + "Informe sua " + (y + 1) + "ª resposta: ");
            	String linha = scanner.nextLine();
                resposta[x][y] = linha.charAt(0);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Gabarito Correto: ");
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print(resposta[x][y] + " ");
            }
            System.out.println();
        }
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[0].length; y++) {
                if (resposta[x][y] == gabarito[y]) {
                    soma++;
                    resultado[x] = soma;
                }
            }
            soma = 0;
        }
        System.out.println();
        for (int x = 0; x < resultado.length; x++) {
            System.out.println("A nota do " + (x + 1) + "º aluno foi: " + resultado[x] + " pontos.");
        }
    }
}