package AulaArrays;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//Fa�a um Programa que leia 4 notas, mostre as notas e a m�dia na tela. 

		
		Scanner scanner = new Scanner(System.in);
		
		float[] notas = new float[4];
		float somaNotas = 0;
		float media = 0;
		
		System.out.println("Digite as 4 notas do aluno: ");
		
		for (int i=0; i < notas.length; i++) {
			notas[i] = scanner.nextFloat();
			somaNotas += notas[i];
			media = somaNotas/4;
		}		
		System.out.println("A soma das notas �: "+somaNotas +" pontos.");
		System.out.println("A m�dia das notas �: " +media +" pontos.");

	}

}
