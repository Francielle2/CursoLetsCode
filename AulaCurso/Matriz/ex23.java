package Matriz;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
//Faca um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A².
		
		Scanner scanner = new Scanner(System.in);
		
		float matrizA[][] = new float[3][3];
		float matrizB[][] = new float[3][3];
		
		boolean executar = true;
	    int opcao;
		
		System.out.printf("Digite os numeros da Matriz A:\n");
		for(int i=0; i<matrizA.length; i++){
			for(int j=0; j<matrizA.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	            matrizA[i][j] = scanner.nextInt();

	            matrizB[i][j] = (float) Math.pow(matrizA[i][j], 2);
			}
		}
		System.out.println("");        
        System.out.println("Matriz Resultado:");
        for (float[] linhas : matrizB){
            for (float valor : linhas){
                System.out.printf("%3.0f ",valor);
            }
            System.out.println();
      	}
	}
}
