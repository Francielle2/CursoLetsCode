package Exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o entre 0 e 100, 
//quantos est�o entre 101 e 200 e quantos s�o maiores de 200.
		
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
		
		System.out.println("Total de n�meros entre 0 e 100: " +qtd0100);
		System.out.println("Total de n�meros entre 101 e 200: " +qtd101200);
		System.out.println("Total de n�meros maior que 200: " +qtd200);

	}

}
