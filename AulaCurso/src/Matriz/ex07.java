package Matriz;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
//Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:
//A[i][j] = 2i + 7j − 2 se i < j;
//A[i][j] = 3i² − 1 se i = j;
//A[i][j] = 4i³ − 5j² + 1 se i > j.

		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[2][2];

		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.print("Insira a posição [" + i + "][" + j + "] da matriz: ");
	            matriz[i][j] = scanner.nextInt();
				
				if(i < j){
					matriz[i][j] = ((2*i) + (7*j) - 2);
				}
				else if(i > j){
					matriz[i][j] = (4*((int) Math.pow(i, 3))) - (5*((int) Math.pow(j, 3)));
				}
				else {
					matriz[i][j] = (3*((int) Math.pow(i, 2))) - 1;
				}
			}
		}
		System.out.println("Matriz:");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.printf("%d", matriz[i][j]);
		}
		System.out.print("\n");
		}
	  }
}