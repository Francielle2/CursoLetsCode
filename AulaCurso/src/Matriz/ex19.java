package Matriz;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
/* Faca um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes informacoes sobre alunos de uma disciplina, 
sendo todas as informacoes do tipo inteiro:
• Primeira coluna: numero de matrıcula (use um inteiro)
• Segunda coluna: media das provas
• Terceira coluna: media dos trabalhos
• Quarta coluna: nota final
Elabore um programa que:
(a) Leia as tres primeiras informacoes de cada aluno
(b) Calcule a nota final como sendo a soma da media das provas e da media dos trabalhos
(c) Imprima a matrıcula do aluno que obteve a maior nota final (assuma que so existe uma maior nota)
(d) Imprima a media aritmetica das notas finais  */

		Scanner scanner = new Scanner(System.in);

        int coluna = 4;
        int linha = 5;
        int indice = 0;
        int soma = 0;

        int maiorNota = 0;

        int[][] matriz = new int[linha][coluna];

        //INSERE O VALORES NA MATRIZ
        System.out.println("Informe os valores abaixo: ");
        System.out.println("");
        for (int x = 0; x < linha; x++) {
            System.out.print((x + 1) + "º Aluno : \nNº da matricula, Média das Provas, Média Trabalhos: ");
            for (int y = 0; y < (coluna - 1); y++) {
                matriz[x][y] = scanner.nextInt();
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int x = 0; x < linha; x++) {
            matriz[x][3] = (matriz[x][1] + matriz[x][2]);
        }       
       
        for (int x = 0; x < matriz.length; x++) {
            if (x == 0) {
                maiorNota = matriz[x][3];
                indice = x;
            }
            if (matriz[x][3] > maiorNota) {
                maiorNota = matriz[x][3];
                indice = x;
            }
        }
        
         for (int x = 0; x < linha; x++) {
            soma += matriz[x][3];
        }
        int media=soma/linha;
        
        System.out.println("");
        System.out.print("Maior nota " + maiorNota + " Matricula " + matriz[indice][0]+" .");
        System.out.println();
        System.out.print("Média Artimética das notas finais é: " + media + ". ");
        System.out.println();
        System.out.println("");
    }
}