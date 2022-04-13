package Exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//Escreva um algoritmo que calcule a soma dos números de 1 a 15.
		
		Scanner scanner = new Scanner(System.in);
		
		int resultado = 0;
		int numero = 0;
		
		for (int i=0; i<15; i++) {
			resultado += numero;
			numero = scanner.nextInt();
		}
		System.out.println("A soma dos números é: " +resultado);
	}
}
