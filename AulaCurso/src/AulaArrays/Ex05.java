package AulaArrays;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//Faça um programa que leia 20 números inteiros e armazene-os num vetor.
//Armazene os números pares no vetor PAR e os números ÍMPARES no vetor ímpar. Imprima os três vetores. 

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println("Digite o "+i+ " º número: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.print("\n Numeros digitados: ");
		for(int numero: numeros) {
			System.out.printf("%d ",numero);
		}
		
		System.out.print("\n Números Pares: ");
		for(int pares: numeros) {
			if ( pares % 2 == 0) {

			System.out.printf("%d ",pares);
			} 
		} 
		
		System.out.print("\n Números Impares: ");
		for(int impares: numeros) {
			if ( impares % 2 != 0) {

			System.out.printf("%d ",impares);
			} 
		} 
		
		
	}		
}

