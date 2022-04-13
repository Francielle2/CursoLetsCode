package Matriz;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
//Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.

		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int matrizTrans[][] = new int[3][3];
		
		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
	               
	               matrizTrans[j][i] = matriz[i][j];
	        }
	     }
		System.out.println("Matriz: ");
	    for(int i=0 ; i<matriz.length; i++){
	        for(int j=0 ; j<matriz.length; j++){
	        	System.out.printf("%d  ", matriz[i][j]);
	        }
	        System.out.println("\n");
	    }
	    System.out.println("Matriz Transposta: ");
	    for(int i=0 ; i<matriz.length; i++){
	        for(int j=0 ; j<matriz.length; j++){
	        	System.out.printf("%d  ", matrizTrans[i][j]);
	        }
	        System.out.println("\n");
	}
  }
}