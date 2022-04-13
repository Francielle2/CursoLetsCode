package Exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int qtd0100 = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite o "+ (i+1) + "º número: ");
			numero = scanner.nextInt();

			if(numero <= 100) {
				qtd0100 ++;
			}
		}				
		System.out.println("A quantidade de números entre 0 e 100 é: " +qtd0100);
	}
}