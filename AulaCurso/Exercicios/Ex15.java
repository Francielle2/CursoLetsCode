package Exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
//Escreva um algoritmo que leia uma sequ�ncia de n�meros do usu�rio e realize a soma desses n�meros.
//Encerre a execu��o quando um n�mero negativo for digitado.
		
		Scanner scanner = new Scanner(System.in);
		
		int resultado = 0;
		int numero = 0;
		
		while (numero >= 0) {
			resultado += numero;
			numero = scanner.nextInt();
		}

		System.out.println("A soma dos n�meros digitados �: " +resultado);

	}

}
