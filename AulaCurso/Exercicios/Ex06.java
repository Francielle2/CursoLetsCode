package Exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//Leia a idade de 20 pessoas e exiba a soma das idades.
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int soma = 0;
		
		for (int i=0; i<20; i++) {
			System.out.println("Digite a "+ (i+1) + "ª idade: ");
			idade = scanner.nextInt();
			soma += idade;
		}				
		System.out.println("A soma das idades digitados é: " +soma);
	}
}