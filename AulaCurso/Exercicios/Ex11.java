package Exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia 20 n�meros do usu�rio e exiba quantos n�meros s�o maiores do que 8.

		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int qtdNumeroMaior = 0;
		
		for (int i=0; i<20; i++) {
			System.out.println("Digite o "+ (i+1) + "� n�mero: ");
			numero = scanner.nextInt();

			if(numero > 8) {
				qtdNumeroMaior ++;
			}
		}				
		System.out.println("A quantidade de n�meros maiores que 8 �: " +qtdNumeroMaior);
	}
}
