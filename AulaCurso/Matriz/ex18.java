package Matriz;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
//Faca um programa que permita ao usuario entrar com uma matriz de 3 x 3 numeros inteiros. 
//Em seguida, gere um array unidimensional pela soma dos numeros de cada coluna da matriz 
//E mostre na tela esse array. {5 -8 10}, {1 2 15}, {25 10 7}
//Vai gerar um vetor, onde cada posicao e a soma das colunas da matriz. 
//A primeira posicao sera 5 + 1 + 25, e assim por diante: ResultadoEsperado: {31 4 32}
		
		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int[] soma = new int[3];
		
		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
				}
			}
			System.out.println("");
			System.out.println("Matriz: ");
		    for(int i=0 ; i<matriz.length; i++){
		        for(int j=0 ; j<matriz.length; j++){
		        	System.out.printf("%3d", matriz[i][j]);
		        	
		        	soma[j] += matriz[i][j];
		    }
		        System.out.println("\n");
		    }
		    System.out.println("Vetor Soma: ");
		    for (int somar : soma){
	            	System.out.printf("%2d ",somar);
		        }
		        System.out.println("\n");
	}

}
