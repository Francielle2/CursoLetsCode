package Exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite o "+ (i+1) + "º número: ");
			numero = scanner.nextInt();
			soma += numero;
		}				
		System.out.println("A soma dos números digitados é: " +soma);
	}
}