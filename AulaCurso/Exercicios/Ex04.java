package Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.

		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int numero = 0;
		
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Quantas vezes deseja repetir seu nome:");
		numero = scanner.nextInt();
		
		for (int i=0; i<numero; i++) {
			System.out.println((i+1)+ "- " +nome);
		}				
	}
}