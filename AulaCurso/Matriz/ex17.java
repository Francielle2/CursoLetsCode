package Matriz;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
/*Leia uma matriz 10x3 com as notas de 10 alunos em 3 provas. Em seguida, escreva o numero de alunos cuja pior nota foi na prova 1, 
o numero de alunos cuja pior nota foi na prova 2, e o numero de alunos cuja pior nota foi na prova 3. 
Em caso de empate das piores notas de um aluno, o criterio de desempate e arbitrario, mas o aluno deve ser contabilizado apenas uma vez.
 */
		
        Scanner scanner = new Scanner(System.in);

        int coluna = 3;
        int linha = 10;
        int piorNotaProvaUm = 0;
        int piorNotaProvaDois = 0;
        int piorNotaProvaTres = 0;

        char[][] resposta = new char[linha][coluna];
        int[] piorNota = new int[coluna];
        char[] gabarito = {'a', 'b', 'c'};

        System.out.println("Responda (a,b,c ou d):");     
        for (int x = 0; x < gabarito.length; x++) {
        	System.out.print((x + 1) + "ª resposta: ");
            String g = scanner.nextLine();
            gabarito[x] = g.charAt(0);
        }
        System.out.println("");
        System.out.println("Informe às respostas:");
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
            	System.out.print((x + 1) + "º Aluno - " + "Informe sua " + (y + 1) + "ª resposta: ");
                String l = scanner.nextLine();
                resposta[x][y] = l.charAt(0);
            }
            System.out.println("");
        }
        System.out.println();

        // SOMA OS VALORES CONTIDO NAS COLUNAS E VINCULA NO ARRAY
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                if (resposta[y][x] == 'a') {
                } else {
                    piorNotaProvaUm++;
                }
                if (resposta[y][x] == 'b') {
                } else {
                    piorNotaProvaDois++;
                }
                if (resposta[y][x] == 'c') {
                } else {
                    piorNotaProvaTres++;
                }
            }
            piorNota[x] = piorNotaProvaUm;
            piorNotaProvaUm=0;
        }

        // MOSTRA O ARRAY
        System.out.println();
        System.out.println("Soma dos valores por coluna: ");
        System.out.println();
        for (int valor : piorNota) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Gabarito Correto");
        System.out.println();
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print(resposta[x][y] + " ");
            }
            System.out.println();
        }
    }
}