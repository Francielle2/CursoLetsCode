package AulaArrays;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
//Fa�a um programa que leia um vetor A com 10 n�meros inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
		
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		int[] somaQuadrado = new int[10];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Informe o " +(i+1)+ "� n�mero:");
			numeros[i] = scanner.nextInt();
			somaQuadrado[i] = (numeros[i]*numeros[i]);	
		}
		System.out.print("N�meros do Vetor: ");
		for(int numero: numeros) {
		System.out.printf("%d ",numero);
		}
		System.out.println(" ");
		System.out.print("Soma dos quadrados dos elementos: ");
		for(int numero: somaQuadrado) {
		System.out.printf("%d ",numero);
		}
	}

}
