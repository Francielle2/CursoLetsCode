package Exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//Leia a idade de 20 pessoas e exiba a m�dia das idades.
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int soma = 0;
		float media = 0;
		
		for (int i=0; i<20; i++) {
			System.out.println("Digite a "+ (i+1) + "� idade: ");
			idade = scanner.nextInt();
			soma += idade;
			media = soma/20;
		}				
		System.out.println("A soma das idades digitados �: " +soma);
		System.out.println("A m�dia das idades digitadas �: " +media);
	}
}