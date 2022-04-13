package Matriz;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
//Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posicao das matrizes lidas.

		Scanner scanner = new Scanner(System.in);

		int matrizA[][] = new int[4][4];
		int matrizB[][] = new int[4][4];
		int matrizC[][] = new int[4][4];

		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matrizA.length; i++){
			for(int j=0; j<matrizA.length; j++){
				System.out.print("Insira a posição [" + i + "][" + j + "] da matriz A: ");
	            matrizA[i][j] = scanner.nextInt();
	            System.out.print("Insira a posição [" + i + "][" + j + "] da matriz B: ");
	            matrizB[i][j] = scanner.nextInt();
				
				if(matrizC[i][j] < matrizA[i][j]){
					matrizC[i][j] = matrizA[i][j];
				}
				if(matrizC[i][j] < matrizB[i][j]) {
					matrizC[i][j] = matrizB[i][j];
				}
			}
		}
		System.out.println("Matriz A:");
		for(int i=0; i<matrizA.length; i++){
			for(int j=0; j<matrizA.length; j++){
				System.out.printf("[%d]", matrizA[i][j]);
		}
		System.out.print("\n");
		}
		System.out.println("Matriz B:");
		for(int i=0; i<matrizB.length; i++){
			for(int j=0; j<matrizB.length; j++){
				System.out.printf("[%d]", matrizB[i][j]);
		}
		System.out.print("\n");		
		}
		System.out.println("Matriz C:");
		for(int i=0; i<matrizC.length; i++){
			for(int j=0; j<matrizC.length; j++){
				System.out.printf("[%d]", matrizC[i][j]);
		}
		System.out.print("\n");
		}
	  }
	}