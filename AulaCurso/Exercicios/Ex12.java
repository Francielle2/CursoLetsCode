package Exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia 20 n�meros do usu�rio e exiba quantos n�meros s�o pares
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int qtd = 0;
		
		for (int i = 0; i<20; i++) {
			numero = scanner.nextInt();
			
			if ( numero % 2 == 0) {
				qtd++;
			}
		}
		
		System.out.println("A quantidade de n�meros pares �: "+qtd);

	}

}
