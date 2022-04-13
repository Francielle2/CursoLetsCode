package AulaArrays;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//Fa�a um programa que leia 20 n�meros inteiros e armazene-os num vetor.
//Armazene os n�meros pares no vetor PAR e os n�meros �MPARES no vetor �mpar. Imprima os tr�s vetores. 

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println("Digite o "+i+ " � n�mero: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.print("\n Numeros digitados: ");
		for(int numero: numeros) {
			System.out.printf("%d ",numero);
		}
		
		System.out.print("\n N�meros Pares: ");
		for(int pares: numeros) {
			if ( pares % 2 == 0) {

			System.out.printf("%d ",pares);
			} 
		} 
		
		System.out.print("\n N�meros Impares: ");
		for(int impares: numeros) {
			if ( impares % 2 != 0) {

			System.out.printf("%d ",impares);
			} 
		} 
		
		
	}		
}

