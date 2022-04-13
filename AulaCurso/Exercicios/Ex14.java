package Exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, 
//quantos estão entre 101 e 200 e quantos são maiores de 200.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int qtd0100 = 0;
		int qtd101200 = 0;
		int qtd200 = 0;
		
		for (int i = 0; i<20; i++) {
			numero = scanner.nextInt();
			
			if ( numero >= 0 && numero <= 100) {
				qtd0100++;
			}
			if ( numero >= 101 && numero <= 200) {
				qtd101200++;
			} 
			if (numero > 200){
				qtd200++;
			}
		}
		
		System.out.println("Total de números entre 0 e 100: " +qtd0100);
		System.out.println("Total de números entre 101 e 200: " +qtd101200);
		System.out.println("Total de números maior que 200: " +qtd200);

	}

}
