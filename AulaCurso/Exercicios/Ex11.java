package Exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int qtdNumeroMaior = 0;
		
		for (int i=0; i<20; i++) {
			System.out.println("Digite o "+ (i+1) + "º número: ");
			numero = scanner.nextInt();

			if(numero > 8) {
				qtdNumeroMaior ++;
			}
		}				
		System.out.println("A quantidade de números maiores que 8 é: " +qtdNumeroMaior);
	}
}
