package Matriz;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
//Faca um programa que leia duas matrizes A e B de tamanho 3x3 e calcule C = A ∗ B.
		
		Scanner scanner = new Scanner(System.in);
		
		float matrizA[][] = new float[3][3];
		float matrizB[][] = new float[3][3];
		float matrizC[][] = new float[3][3];
		
		boolean executar = true;
	    int opcao;
		
		System.out.printf("Digite os numeros da Matriz A:\n");
		for(int i=0; i<matrizA.length; i++){
			for(int j=0; j<matrizA.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	            matrizA[i][j] = scanner.nextInt();
			}
		}
		System.out.println("");
		System.out.printf("Digite os numeros da Matriz B:\n");
		for(int i=0; i<matrizB.length; i++){
			for(int j=0; j<matrizB.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	            matrizB[i][j] = scanner.nextInt();
	               
	            matrizC[i][j] = (matrizA[i][j] * matrizB[i][j]);
			}
		}
		System.out.println("");        
        System.out.println("Matriz Resultado:");
        for (float[] linhas : matrizC){
            for (float valor : linhas){
                System.out.printf("%3.0f ",valor);
            }
            System.out.println();
      	}
	}
}
