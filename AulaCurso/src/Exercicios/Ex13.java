package Exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
//Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o entre 0 e 100.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int qtd0100 = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite o "+ (i+1) + "� n�mero: ");
			numero = scanner.nextInt();

			if(numero <= 100) {
				qtd0100 ++;
			}
		}				
		System.out.println("A quantidade de n�meros entre 0 e 100 �: " +qtd0100);
	}
}