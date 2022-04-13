package Exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
//Encerre a execução quando um número negativo for digitado.
		
		Scanner scanner = new Scanner(System.in);
		
		int resultado = 0;
		int numero = 0;
		
		while (numero >= 0) {
			resultado += numero;
			numero = scanner.nextInt();
		}

		System.out.println("A soma dos números digitados é: " +resultado);

	}

}
