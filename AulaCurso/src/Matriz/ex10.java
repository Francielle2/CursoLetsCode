package Matriz;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
//Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao na diagonal principal.

		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int soma = 0;
		
		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
	               soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
	        }
	     }
	    for(int i=0 ; i<matriz.length; i++){
	        for(int j=0 ; j<matriz.length; j++){
	        	System.out.printf("%d  ", matriz[i][j]);
	        }
	        System.out.println("\n");
	    }
	    System.out.printf("A soma dos elementos que estão na diagonal principal é: %d", soma);
	}
}