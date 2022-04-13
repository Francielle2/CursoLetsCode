package Exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		
		for (int i=0; i<10; i++) {
			System.out.println((i+1)+ "- " +nome);
		}
				
	}
}
