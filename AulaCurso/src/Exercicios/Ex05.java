package Exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia 10 n�meros do usu�rio e calcule a soma desses n�meros.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite o "+ (i+1) + "� n�mero: ");
			numero = scanner.nextInt();
			soma += numero;
		}				
		System.out.println("A soma dos n�meros digitados �: " +soma);
	}
}