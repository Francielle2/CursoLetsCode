package Matriz;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
//Gere matriz 4x4 com valores no intervalo[1, 20]. 
//Escreva um programa que transforme a matriz gerada numa matriz triangular inferior
//ou seja, atribuindo zero a todos os elementos acima da diagonal principal. 
//Imprima a matriz original e a matriz transforma

		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[4][4];
		
		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
				}
			}
			System.out.println("\n");
			System.out.println("Matriz Original: ");
		    for(int i=0 ; i<matriz.length; i++){
		        for(int j=0 ; j<matriz.length; j++){
		        	System.out.printf("%d  ", matriz[i][j]);
		    }
		        System.out.println("\n");
		    }
		    System.out.println("Matriz Transforma: ");
		    for(int i=0 ; i<matriz.length; i++){
		        for(int j=0 ; j<matriz.length; j++){
			        	if (j>i){
			            	matriz[i][j] = 0;
			            }
		        	System.out.printf("%d  ", matriz[i][j]);
		        }
		        System.out.println("\n");
	}
  }
}