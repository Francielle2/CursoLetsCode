package Matriz;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
//Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		int maior10 = 0;

		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz.length; j++){
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
	               
	               if (matriz[i][j] > 10) {
	                   maior10 += 1;
	               }
	           }
	       }
		   System.out.println("");
	       System.out.println("A matriz possui " + maior10 + " valores maiores do que DEZ.");
	}
}


