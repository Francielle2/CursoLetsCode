package Matriz;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
//Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da diagonal principal.

		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int soma = 0;
		
		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.print("Insira a posi��o [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
	               soma = matriz[1][0] + matriz[2][0] + matriz[2][1];
	        }
	     }
	    for(int i=0 ; i<matriz.length; i++){
	        for(int j=0 ; j<matriz.length; j++){
	        	System.out.printf("%d  ", matriz[i][j]);
	        }
	        System.out.println("\n");
	    }
	    System.out.printf("A soma dos elementos que est�o aabaixo da diagonal principal �: %d", soma);
	}
}